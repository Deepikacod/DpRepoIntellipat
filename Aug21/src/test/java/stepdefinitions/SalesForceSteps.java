package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BaseCode;
import utility.PageObjectManager;
import utility.TestContext;

import java.io.IOException;

public class SalesForceSteps {

    TestContext context;
    public SalesForceSteps(TestContext context) throws IOException {
            this.context = context;
    }

    @Given("user navigates to salesforce login page")
    public void salesforce() {

    }

    @When("user enter username {string} and password {string}")
    public void userEnterUsernameAndPassword(String userName, String Password) {
        context.pageObjectManager.getSaleForceLoginPage().enterUserName();
        context.pageObjectManager.getSaleForceLoginPage().enterPassword();
    }

    @And("user clicks on the login page")
    public void userClicksOnTheLoginPage() {
        //driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();

    }

    @Then("user validates the navigation to the homepage")
    public void userValidatesTheNavigationToTheHomepage() {
        
    }

    @Then("user validates the error page")
    public void userValidatesTheErrorPage() {
    }
}
