package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BabyWishListPage {

    WebDriver driver;

    public BabyWishListPage(WebDriver driver){
        this.driver=driver;
    }

    public String getBabyWishListText(){
        String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none _gift-registry-header-desktop_style_headerCard__3kHDW']/child::div/child::h2\n")).getText();
        System.out.println(text);
        return text;

    }
}
