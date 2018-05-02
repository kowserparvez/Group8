package homePage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.ArrayList;
import java.util.List;

public class SearchItems extends CommonAPI {
    @FindBy(how=How.CSS,using="#search-field")
    public static WebElement searchInputWebElement;
    @FindBy(how=How.CSS,using=".co-search-thin")
    public static WebElement submitButtonWebElement;

    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }
    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void searchFor(String value){
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton(){
        getSubmitButtonWebElement().click();
    }
    public void clearInput(){
        getSearchInputWebElement().clear();
    }

    public WebElement getSearchInputField(){return searchInputWebElement; }
    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputWebElement = searchInputField;
    }

    public void searchItems()throws InterruptedException{
        List<String> itemList = getItemValue();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }
    public static List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Laptop");
        itemsList.add("Toothpaste");
        itemsList.add("Furniture");
        itemsList.add("Bracelets");


        return itemsList;
    }
}


//@FindBy(how = How.CSS, using ="#twotabsearchtextbox")
//    public static WebElement searchInputWebElement;