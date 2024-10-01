package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions (
    features = {"src/test/resources/testdesign"},
    glue = {"stepdefinitions"},
        tags = "@wiki01",
        plugin = {"pretty",
                "html:target/reports/cucumber.html",
                "json:target/reports/test.json",
                "junit:target/reports/report.xml"}


)

public class Runner {
}
