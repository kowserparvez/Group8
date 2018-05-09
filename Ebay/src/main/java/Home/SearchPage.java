package Home;

import base.CommonAPI;
import Database.ConnectDB;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

 public class SearchPage extends CommonAPI{
        @FindBy(xpath ="//input[@name='_nkw']")
        public static WebElement searchInputWebElement;

        @FindBy(how = How.CSS, using =".nav-input")
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
    public void searchItemsAndSubmitButton()throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ItemSearched itemsToBeSearched = new ItemSearched();
        String [] value = itemsToBeSearched.getDataFromExcelFile();
        for(int i=0; i<value.length; i++) {
            searchFor(value[i]);
            submitSearchButton();
            clearInput();
        }
  }

    public WebElement getSearchInputField(WebElement searchInputWebElement) {
        return searchInputWebElement;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputWebElement = searchInputField;
    }

    public void searchItems()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> itemList = getItemValue();
        for(String st: itemList) {
            getSearchInputField( searchInputWebElement ).sendKeys(st, Keys.ENTER);
            getSearchInputField( searchInputWebElement ).clear();
        }
    }

    public static List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String> ();
        itemsList.add("Java Book");
        itemsList.add("Selenium Book");
        itemsList.add("Laptop");
        itemsList.add("Computer");
        itemsList.add("McaFee");
        itemsList.add("8GB Ram");
        itemsList.add("HP Monitor");
        itemsList.add("Unlock iPhone");

        return itemsList;
    }
     public static void main(String[] args) {
         ConnectDB connectDB = new ConnectDB();
         connectDB.insertDataFromArrayListToMySql(getItemValue(),"Sahara","list");
     }

 }

