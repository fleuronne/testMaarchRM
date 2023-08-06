package modules;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;
@RunWith(Cucumber.class)
//Toutes les options necessaires pour configurer notre Test
@CucumberOptions(
//        strict = true,
        plugin = {"pretty", "json:target/json/results.json","html:target/HtmlReports","junit:target/JUnitrepots/report.xml"},
        features = {"src/test/ressources/features"},
        glue = {"modules","stepsDefinition"}
//        tags = "@google_search, @acc01"
//        name = {"acc01","@adduser"}
)
public class TestRunner {
}
