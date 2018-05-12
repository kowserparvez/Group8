package LogInPage;

import base.CommonAPI;
import com.google.api.client.util.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class CreditScore extends CommonAPI{

    @FindBy(xpath = "//*[@data-pt-name='hd_hamburger']")
    WebElement HamMenu;
    @FindBy(xpath = "//*[@data-pt-name='sm_get_credit_score']")
    WebElement CreditScore;


    public void ClickHamMenu(){
        clickByXpath ( "//*[@data-pt-name='hd_hamburger']" );
    }
    public void ClickCreditScore(){
        clickByXpath ( "//*[@data-pt-name='sm_get_credit_score']" );
    }
}