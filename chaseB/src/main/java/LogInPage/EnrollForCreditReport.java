package LogInPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnrollForCreditReport extends CommonAPI {
    @FindBy(id =  "BtnEnrollNow")
    WebElement Enroll;

    public void clickEnroll(){
        clickByXpath ( "//*[@data-pt-name='hd_enroll_now']" );
    }
}
