package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage {

    public static WebDriver driver;

//    public static void openWebSitePage() {
//        driver.get("http://44.201.208.172/");
//    }

    @FindBy(name = "userName")
    private static WebElement first_name;

    public static void names(String name){
        first_name.sendKeys(name);
    }

    @FindBy(name = "password")
    private static WebElement first_pwd;
    public static void setFirst_pwd(String password){
        first_pwd.sendKeys(password);
    }

    @FindBy(id="loginButton")
    private static WebElement login_click;

    public static void login_button(){
        login_click.click();
    }

    @FindBy(className = "dropdown-toggle")
    private static WebElement menu_administrator;

    public static void adminMenu(){
        menu_administrator.click();
    }
//
//    @FindBy(className = "fa fa-key fa-fw")
//    private static WebElement menu_security;
//
//    public static void secMenu(){
//        menu_security.click();
//    }
//
//    @FindBy(className = "dropdown-submenu")
//    private static WebElement users;
//
//    public static void userHome(){
//        users.click();
//    }

    @FindBy(id = "user_newUser")
    private static WebElement addusers;

    public static void setAddusers(){
        addusers.click();
    }

    @FindBy(name = "accountName")
    private static WebElement ident;

    public static void identify(String id){
        ident.sendKeys(id);
    }

    @FindBy(name = "password")
    private static WebElement first_password;
    public static void password(String password){
        first_password.sendKeys(password);
    }

    @FindBy(name = "verification")
    private static WebElement confirm_password;
    public static void setConfirm_password(String password){
        confirm_password.sendKeys(password);
    }

    @FindBy(name = "displayName")
    private static WebElement name;

    public static void setName(String id){
        name.sendKeys(id);
    }

    @FindBy(id = "user_showNamesForm")
    private static WebElement valide_name;

    public static void setValide_name(){
        valide_name.click();
    }

    @FindBy(name = "emailAddress")
    private static WebElement email;
    public static void setEmail(String mail){
        email.sendKeys(mail);
    }

    @FindBy(partialLinkText = "#userRoleTab")
    private static WebElement roles;
    public static void setRole(){
        roles.click();
    }

    @FindBy(className = "list-group-item")
    private static WebElement rolesuser;
    public static void setRolesuser(){
        rolesuser.click();
    }

    @FindBy(partialLinkText = "#orgTab")
    private static WebElement service;
    public static void setService(){
        service.click();
    }

    @FindBy(id = "orgTypeahead")
    private static WebElement serviceuser;
    public static void setServiceuser( String serviceuser1){
        serviceuser.sendKeys(serviceuser1);
    }

    @FindBy(id="addOrg")
    private static WebElement addservice;
    public static void setAddservice(){
        addservice.click();
    }

    @FindBy(id="user_saveUser")
    private static WebElement save;
    public static void setSave(){
        save.click();
    }
}
