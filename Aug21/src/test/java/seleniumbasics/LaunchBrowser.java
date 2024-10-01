package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
        driver.findElement(By.id("username")).sendKeys("lmti");
        driver.findElement(By.id("password")).sendKeys("123");
    }

}
