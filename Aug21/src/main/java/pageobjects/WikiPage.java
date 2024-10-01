package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WikiPage {

    WebDriver driver;

    public WikiPage(WebDriver driver){
        this.driver = driver;

    }

    public List<String> getShareHolderValue(){
        int size = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();
        List<String> shareHolderValuelist = new ArrayList<String>();
        for(int k=0; k < size; k++) {
            String shareHolderValue = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(k).getText();
            System.out.println(shareHolderValue);
            shareHolderValuelist.add(shareHolderValue);
        }

        return shareHolderValuelist;
    }

    public List<String> getShareHoldingValue(){
        int size = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).size();
        List<String> shareHoldingValuelist = new ArrayList<String>();
        for(int d=0; d < size; d++) {
            String shareHoldingValue = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).get(d).getText();
            System.out.println(shareHoldingValue);
            shareHoldingValuelist.add(shareHoldingValue);
        }
        return shareHoldingValuelist;
    }

}
