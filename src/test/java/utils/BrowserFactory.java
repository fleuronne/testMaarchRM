package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.HashMap;

public class BrowserFactory {

    static WebDriver factoryDriver;
    private static HashMap<String,String> configurationsMap = PropertiesFile.read("src/test/ressources/configurations/config.properties");
   static String  webTypeBrowser = configurationsMap.get("browser");

   static boolean headless = Boolean.parseBoolean(configurationsMap.get("isheadless"));
 public static WebDriver getFactoryDriver(){
    String driverPath = "src/test/ressources/drivers/";
     switch (webTypeBrowser){
         case "chrome":
             System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");

             ChromeOptions options = new ChromeOptions();
             options.addArguments("--start-maximized");
             options.addArguments("--ignore-certificate-errors");
             options.addArguments("--disable-popup-blocking");
             options.addArguments("--incognito");
             options.addArguments("--remote-allow-origins=*");
             options.setHeadless(headless); //permet d'executer le test en arriere plan
             factoryDriver = new ChromeDriver(options);
             break;

         case "ie":
             System.setProperty("webdriver.ie.driver", driverPath + "IEDriverServer.exe");
             factoryDriver = new InternetExplorerDriver();
             break;
         case "firefox":
             System.setProperty("webdriver.firefox.driver", driverPath + "geckodriver.exe");
             factoryDriver = new FirefoxDriver();
             break;

         default:
             break;

     }
        return factoryDriver;
    }
}
