package Home;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SerchPage extends CommonAPI{


    @FindBy(xpath = "//input[@class='cnn-search__input']")
    WebElement search;

    public void search() {
        search.sendKeys ( "world news" );


    }
}
