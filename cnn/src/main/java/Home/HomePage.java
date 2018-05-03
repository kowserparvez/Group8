package Home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {


    @FindBy(xpath = "//div[@class='nav-menu__hamburger]")
    WebElement menu;
    @FindBy(id = "search-input-field")
    WebElement search;

    public void menu() {
        menu.click ();
    }
        public void search() {
            search.sendKeys ( "Latest News" );


    }
}


