package homepage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Kowser on 5/5/2018.
 */
public class MultipleItemsSearch {

    @FindBy(how = How.CSS, using ="#global-search-input")
    public WebElement searchInputWebElement;

    ////span[@class='icon elc-icon elc-icon-search-nav']
    @FindBy(how = How.XPATH, using ="//button[@class='header-GlobalSearch-submit btn']")
    public WebElement submitButtonWebElement;

    public WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }

    public void setSearchInputWebElement(WebElement searchInputWebElement) {
        this.searchInputWebElement = searchInputWebElement;
    }

    public WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void setSubmitButtonWebElement(WebElement submitButtonWebElement) {
        this.submitButtonWebElement = submitButtonWebElement;
    }


    public void searchItems()throws InterruptedException{
        //  TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> itemList = getItemValue();
        for(String st: itemList) {
            getSearchInputWebElement().sendKeys(st);
            getSubmitButtonWebElement().click();
            getSearchInputWebElement().clear();
        }
    }

    public List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Milk");
        itemsList.add("Water");
        itemsList.add("Soda");
        itemsList.add("Bread");
        itemsList.add("Tea");
        return itemsList;
    }




}
