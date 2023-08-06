package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static modules.Hooks.driver;

public class AccountPage {

    public static WebDriver driver;


    public static void openWebSitePage() {
        driver.get("http://44.201.208.172");
    }

    @FindBy(name = "userName")
    private static WebElement first_name;

    public static void name(String name){
        first_name.sendKeys(name);
    }

    @FindBy(name = "password")
    private static WebElement first_password;
    public static void password(String password){
        first_password.sendKeys(password);
    }

    @FindBy(id="loginButton")
    private static WebElement login_click;

    public static void login_button(){
        login_click.click();
    }


}
