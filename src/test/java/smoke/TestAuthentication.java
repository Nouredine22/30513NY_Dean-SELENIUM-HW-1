package smoke;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.LoginPage;
import pom.MyAccountPage;

public class TestAuthentication extends BasePage {
    @Test

    public void testValidLogin(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = homePage.clickOnSignInLink();
        MyAccountPage myAccountPage = loginPage.doLogin(config.appUser,config.appPassword);

        Assert.assertTrue(myAccountPage.isMessageDisplay(),"Validate My Account Message Displayed");
    }

}
