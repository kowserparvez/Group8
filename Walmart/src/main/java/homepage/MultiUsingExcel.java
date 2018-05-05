package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;

/**
 * @Author Kowser on 5/5/2018.
 */
public class MultiUsingExcel extends CommonAPI{

    DataReader dr = new DataReader();

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

    public String[] getDataFromExcelFile() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String path = System.getProperty("user.dir")+"/data/Book1.xls";
        String [] data = dr.fileReader(path);
        return data;
    }

    public void searchWithExcel() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String [] value =getDataFromExcelFile();
        for(int i=1; i<value.length; i++) {
            getSearchInputWebElement().sendKeys(value[i]);
            getSubmitButtonWebElement().click();
            getSearchInputWebElement().clear();
        }
    }



}
