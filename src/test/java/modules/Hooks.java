package modules;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import pageObjects.AccountPage;
import pageObjects.AddUserPage;
import pageObjects.GoogleSearch;

import static utils.BrowserFactory.getFactoryDriver;

public class Hooks {

   public static WebDriver driver;
   private GoogleSearch googleSearch = new GoogleSearch();
   private AccountPage accountPage = new AccountPage();

   private AddUserPage addUserPage = new AddUserPage();
    @Before
    public void setUp(){
        driver = getFactoryDriver();
        PageFactory.initElements(driver, googleSearch);
        PageFactory.initElements(driver,accountPage);
        PageFactory.initElements(driver,addUserPage);

    }

    @After
    public void tearDown(){
//        driver.quit();
    }
}
