package smoke;

import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.ResultsPage;
import pom.SearchPage;

public class TestSearchingItems extends BasePage {

    //String item = "Blouse";


    @Test
    public void testAbilitytoFindAnItems(){
        String item = "Blouse";


        SearchPage searchPage = new SearchPage();
       ResultsPage resultsPage =  searchPage.doSearch(item);
        Assert.assertTrue(resultsPage.isSearchedItemDisplayed());


    }


}
