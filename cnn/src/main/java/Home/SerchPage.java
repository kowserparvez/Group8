package Home;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SerchPage extends CommonAPI {

    @FindBy(xpath = "//input[@class='search__input-field']")
    WebElement search;
    @FindBy(xpath = "//body[@class='pg pg-homepage pg-section domestic t-light multi-ads--complete nav-open search-open']")
    WebElement us;

    public void search() {
        search.sendKeys ( "world news" );

    }
    public void us(){
        us.click ();
    }
}