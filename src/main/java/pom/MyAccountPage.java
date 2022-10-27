package pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {
    public MyAccountPage (){
        PageFactory.initElements(driver,this);

    }

    @FindBy (xpath= "//span[@class='navigation_page']")
    public WebElement myAccountMessage;

    //method region
    public boolean isMessageDisplay(){
        return isElementVisible(myAccountMessage);

    }

}
