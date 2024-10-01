package utility;

import org.openqa.selenium.WebDriver;
import pageobjects.*;

public class PageObjectManager {

    WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }
    public BabyWishListPage getBabyWishListPage(){
        BabyWishListPage babyWishListPage = new BabyWishListPage(driver);
        return babyWishListPage;
    }

    public HomePage getHomePage(){
        HomePage homePage = new HomePage(driver);
        return homePage;

    }


    public SpiceJetPage getSpiceJetPage(){
        SpiceJetPage spiceJetPage = new SpiceJetPage(driver);
        return spiceJetPage;
    }

    public LearnMoreHomePage getLearnMoreHomePage(){
        LearnMoreHomePage learnMoreHomePage = new LearnMoreHomePage(driver);
        return learnMoreHomePage;
    }

    public SaleForceLoginPage getSaleForceLoginPage(){
        SaleForceLoginPage saleForceLoginPage = new SaleForceLoginPage(driver);
        return saleForceLoginPage;
    }

    public WikiPage getWikiPage(){
        WikiPage wikiPage = new WikiPage(driver);
        return wikiPage;
    }


}
