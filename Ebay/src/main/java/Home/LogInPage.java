package Home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends CommonAPI{

    @FindBy(id = "userid")
    WebElement userid;
    @FindBy(id = "pass")
    WebElement pass;
    @FindBy(id="sgnBt")
    WebElement sgnBt;

    public void enterUserid(){
        userid.sendKeys ( "sayed1970" );
    }
    public void enterPass(){
        pass.sendKeys ( "mithu1970");
    }
    public void clicksgnBt(){
        sgnBt.click ();
    }


}
