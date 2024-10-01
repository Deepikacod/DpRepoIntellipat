package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterProductName(String productname){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productname);
    }

    public void clickSearchIcon(){
        driver.findElement(By.id("nav-search-submit-button")).click();

    }
    public void selectDropdownValue(){
        WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));
        Select categoryDropdown = new Select(categoryElement);
        //categoryDropdown.selectByIndex(2);
        //categoryDropdown.selectByVisibleText("Books");
        categoryDropdown.selectByValue("search-alias=amazon-devices");
    }

    public void clickBabyWishList(){
        WebElement accountElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a = new Actions(driver);
        a.clickAndHold(accountElement).build().perform();
        driver.findElement(By.xpath("//span[text()='Baby Wishlist']")).click();
    }

    public void getDropdownText(){

        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        int dropsize = dropdown.findElements(By.tagName("option")).size();
        for (int i =0; i <dropsize; i++){
            String dropval = dropdown.findElements(By.tagName("option")).get(i).getText();
            System.out.println(dropval);
        }
    }
}
