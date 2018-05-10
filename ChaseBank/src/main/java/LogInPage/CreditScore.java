package LogInPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditScore extends CommonAPI{
    @FindBy(id = "skip-sidemenu")
    WebElement HamMenu;

    public void ClickHamMenu(){
        HamMenu.click ();
    }
}
