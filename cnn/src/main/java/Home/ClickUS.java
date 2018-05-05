package Home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickUS extends CommonAPI{
    @FindBy(xpath = "//body[@class='pg pg-homepage pg-section domestic t-light multi-ads--complete nav-open search-open']")
    WebElement us;
    public void us(){
        us.click ();
    }
}
