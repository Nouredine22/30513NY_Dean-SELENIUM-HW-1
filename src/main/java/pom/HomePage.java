package pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    //webelements
    @FindBy(xpath ="//a[@class='login']")
    public WebElement signInLink;

    //method region
    public LoginPage clickOnSignInLink(){
        clickOnElement(signInLink);

        return new LoginPage();


    }
}
