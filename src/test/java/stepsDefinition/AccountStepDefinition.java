package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static modules.Hooks.driver;
import static org.junit.Assert.assertTrue;
import static pageObjects.AccountPage.*;
import static pageObjects.GoogleSearch.searchFor;

public class AccountStepDefinition {

    @Given("i open maarch page")
    public void iOpenmaarchPage() {
        driver.get("http://44.201.208.172");
    }

    //****************  acc01 - Login  ******************//

    @When("User enters name address {string}")
    public void userEntersEmailAddress(String name) {
        name(name);
    }

    @When("User enters password {string}")
    public void userEntersPassword(String password) {
        password(password);
    }

    @When("User clicks to the login button")
    public void userClicksToTheLoginButton() {
        login_button();
    }

    @Then("Verify that the user is connected")
    public void verifyThatTheUserIsConnected() {
        /*verify();*/
    }


}
