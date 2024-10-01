package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SalesForce {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("apple");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
        driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
        String errorMessage = driver.findElement(By.id("error")).getText();
        System.out.println(errorMessage);



    }

}
