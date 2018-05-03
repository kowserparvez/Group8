package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotAccount extends CommonAPI {
    @FindBy(xpath= ".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")
    public static WebElement forget;
    @FindBy(xpath= ".//*[@id='identify_email']")
    public static WebElement email;

    public void clickOnForgotAcc(String Email){
        forget.click();
        email.sendKeys(Email);
    }
    public void goToSignUpPage() {
    }
}