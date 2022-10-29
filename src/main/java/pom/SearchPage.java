package pom;

import base.BasePage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {

    public  SearchPage() {
        PageFactory.initElements(driver, this);
    }
    //find Webelements

    @FindBy(xpath = "//input[@id ='search_query_top']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@name='submit_search']")
    public WebElement searchButton;
    
    //method region
    public void inputItemSearch(String item){

        sendKeysToElement(searchBox, item);
    }
    public void clickOnSearch(){
        clickOnElement(searchButton);

    }
    public ResultsPage doSearch (String item){
        inputItemSearch(item);
        clickOnSearch();

        return new ResultsPage();

    }

}

