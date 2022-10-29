package pom;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage extends BasePage {
    public  ResultsPage(){
        PageFactory.initElements(driver,this);
    }
    //webElement
    @FindBy(xpath="//ul[@class='product_list grid row']")
    public WebElement foundedItem;

    //
    public boolean isSearchedItemDisplayed(){
        return isElementVisible(foundedItem);

    }


}
