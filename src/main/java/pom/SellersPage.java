package pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellersPage extends BasePage {
    public SellersPage (){
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath="//div[@id='center_column']")
    public WebElement listOfItems;

    public boolean isBestSellersDisplayed(){
        return isElementVisible(listOfItems);
    }
}
