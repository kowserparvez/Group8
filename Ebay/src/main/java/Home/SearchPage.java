package Home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public  class SearchPage extends CommonAPI{
    @FindBy(id = "gh-ac")
    WebElement searchBox;

    //method
    public void searchBox() {
        searchBox.sendKeys("computer", Keys.ENTER);

    }


}
