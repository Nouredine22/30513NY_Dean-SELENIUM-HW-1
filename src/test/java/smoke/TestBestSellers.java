package smoke;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.SellersPage;

public class TestBestSellers extends BasePage {
    @Test

    public void  TestAbilityToSeeBestSellers(){
        HomePage homePage = new HomePage();
        SellersPage sellersPage = homePage.clickOnBestSellerLink();
        Assert.assertTrue(sellersPage.isBestSellersDisplayed());

    }
}
