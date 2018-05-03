package Home;

import base.CommonAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public  class SearchPage extends CommonAPI {
    @FindBy(xpath = "//input[@name='_nkw']")
    WebElement searchBox;

    //method
    public String searchBox() {
        searchBox.sendKeys ( "computer", Keys.ENTER );

        return null;
    }

}

