package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static modules.Hooks.driver;
import static pageObjects.AccountPage.login_button;
import static pageObjects.AccountPage.name;
import static pageObjects.AccountPage.password;
import static pageObjects.AddUserPage.*;

public class AddUserStepDefinition {

    @Given("User is on the home page")

    public void iOpenmaarchHomePage() {
        driver.get("http://44.201.208.172");
    }

    @When ("User enters name login <nom>")
    public void userEntersname(String name) {
        names(name);
    }
    @And ("User enters password login <pwd>")
    public void userEntersPwd(String password) {
        setFirst_pwd(password);
    }
    @And ("User clicks to the login button login")
    public void userClicksToTheLoginButton() {
        login_button();
    }
    @And("User click in administrateur")
    public void userClickAdmin() {
        adminMenu();
    }
//
//    @When ("User click in securite")
//    public void userClickSecu() {
//        secMenu();
//    }
//
//    @When ("User click in user")
//    public void userClickUser(String name) {
//        userHome();
//    }

    @And ("USer click in button add")
    public void userClickAddButton() {
        setAddusers();
    }

    @And ("user enter identifiant <ident>")
    public void userEnterIdent(String ident){
        identify(ident);
    }

    @And ("User enters password <password>")
    public void userEnterPwd(String password){
        password(password);
    }

    @And ("User confirm password <password>")
    public void userConfirmPwd(String pwd){
        setConfirm_password(pwd);
    }

    @And ("User enters name <name>")
    public void userEnterName(String name){
        setName(name);
    }

    @And ("User click plus button name")
    public void userClickPlus(){
        setValide_name();
    }

    @And ("User enters address <mail>")
    public void userEnterMail(String mail){
        setEmail(mail);
    }

    @And ("User click to role users")
    public void userClickRoleUser(){
        setRole();
    }

    @And ("User select role <role>")
    public void userSelectRole(){
        setRolesuser();
    }
    @And ("User click in service")
    public void userClickService(){
        setService();
    }
    @And ("User choice service <service>")
    public void userChoiceService(String service){
        setServiceuser(service);
    }

    @And ("User click plus button service")
    public void userClickAddService(){
        setAddservice();
    }

    @When ("User click in save button")
    public void userClickSave(){
        setSave();
    }

//    @Then("User see a list users")
//    @And("User can open user to see list user")
}
