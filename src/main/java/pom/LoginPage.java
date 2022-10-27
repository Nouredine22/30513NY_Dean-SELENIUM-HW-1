package pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    //find webelement
    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "passwd")
    public WebElement inputPassword;

    @FindBy( id = "SubmitLogin")
    public WebElement buttonLogin;

    //method region

    public void enterEmail(String email){
        sendKeysToElement(inputEmail,email);
    }

    public void enterPassword(String password){
        sendKeysToElement(inputPassword,password);
    }
    public void clickOnLongin(){
        clickOnElement(buttonLogin);
    }

    public MyAccountPage doLogin(String email,String password){
        enterEmail(email);
        enterPassword(password);
        clickOnLongin();

        return new MyAccountPage();
    }

}
