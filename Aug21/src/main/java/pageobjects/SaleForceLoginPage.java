package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaleForceLoginPage {
    WebDriver driver;

    public SaleForceLoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void enterUserName(){
        driver.findElement(By.id("username")).sendKeys("abc");
    }

    public void enterPassword(){
        driver.findElement(By.id("password")).sendKeys("123");

    }

    public void clickLoginButton(){

    }


}
