package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

/**
 * @Author Kowser on 5/2/2018.
 */
public class OnlineBankingLogin extends CommonAPI{

    @FindBy (xpath = "//a[@id='OnlineLogin']")
    public static WebElement logInBtn;

    public static WebElement getLogInBtn() {
        return logInBtn;
    }

    public static void setLogInBtn(WebElement logInBtn) {
        OnlineBankingLogin.logInBtn = logInBtn;
    }

    public void clickOnlineLogIn(){
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLogInBtn().click();
    }
}
