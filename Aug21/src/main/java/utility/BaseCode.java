package utility;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseCode {

    public WebDriver getWebDriver() throws IOException {

        WebDriver driver;
        File location = new File("src/main/resources/configuration/frameworkconfig.properties");
        FileInputStream fis = new FileInputStream(location);
        Properties prob = new Properties();
        prob.load(fis);
        if(prob.getProperty("browser").equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else if(prob.getProperty("browser").equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }
        else if(prob.getProperty("browser").equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }
        else {
            throw new InvalidArgumentException("Enter valid browser name");
        }

        driver.get(prob.getProperty("environment"));
        return driver;
    }

}
