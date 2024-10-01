package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SpiceJetPage {

    WebDriver driver;

    public SpiceJetPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectCurrency(){

        WebElement currencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
        Select currencyDropdown = new Select(currencyElement);
        currencyDropdown.selectByIndex(2);
        currencyDropdown.selectByVisibleText("");
        currencyDropdown.selectByValue("");
    }
}
