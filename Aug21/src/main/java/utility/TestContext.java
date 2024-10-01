package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContext {


    public BaseCode b;
    public PageObjectManager pageObjectManager;

    public TestContext() throws IOException {
        b = new BaseCode();
        pageObjectManager = new PageObjectManager(b.getWebDriver());
    }


}
