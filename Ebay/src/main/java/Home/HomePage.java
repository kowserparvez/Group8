package Home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

       @FindBy(id = "gh-logo")
        WebElement loginLink;
       public void clickLogin(){
           loginLink.sendKeys ( "https://www.ebay.com/" );
   }
}
