package Home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickUS extends CommonAPI{
    @FindBy(xpath = "//div[@class='nav-section__name js-nav-section-name']")
    WebElement us;
    public void us(){
        us.click ();
    }
}
