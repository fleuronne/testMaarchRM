package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertTrue;
import static modules.Hooks.driver;
import static pageObjects.GoogleSearch.searchFor;

public class GoogleSearchStepsDefinition {



    @Given("I open google search page")
    public void iOpenGoogleSearchPage(){

    driver.get("https://www.google.com/");
    }
    @When("I lookup The word {string}")
    public void iLookupTheWord(String string) {
//        throw new io.cucumber.java.PendingException();
        searchFor(string);
    }
    @Then("search rewrite display the word {string}")
    public void searchRewriteDisplayTheWord(String string) {
       assertTrue(driver.getTitle().contains(string));
       driver.quit();
    }
}
