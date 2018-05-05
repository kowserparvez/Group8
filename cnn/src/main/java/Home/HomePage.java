package Home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {


    @FindBy(xpath = "//*[@id='menu']")
    WebElement menu;
    @FindBy(xpath = "//div[@id='search-button']")
    WebElement clickon;
    @FindBy(xpath = "//input[@class='search__input-field']")
    WebElement search;

    public void menu() {
        menu.click ();
    }
    public void clickon() {
        clickon.click ();
    }
    public void search() {
       // waitUntilClickAble (By.xpath ( "//input[@class='search__input-field']"));
        search.sendKeys ( "world news" );

        }
}

