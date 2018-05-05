package test.authentication;

import authentication.OnlineBankingLogin;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

/**
 * @Author Kowser on 5/2/2018.
 */
public class OnlineBankingLoginTest extends CommonAPI {

    @Test
    public void onlineBankingLoginBtnElement() {
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        OnlineBankingLogin onlineBankingLogin = PageFactory.initElements(driver, OnlineBankingLogin.class);
        onlineBankingLogin.clickOnlineLogIn();
    }
}
