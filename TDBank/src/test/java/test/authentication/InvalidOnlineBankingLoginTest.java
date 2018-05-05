package test.authentication;

import authentication.InvalidOnlineBankingLogin;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

/**
 * @Author Kowser on 5/2/2018.
 */
public class InvalidOnlineBankingLoginTest extends CommonAPI{
    @Test
    public void invalidLoginTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InvalidOnlineBankingLogin invalidOnlineBankingLogin = PageFactory.initElements(driver,InvalidOnlineBankingLogin.class);
        invalidOnlineBankingLogin.InvalidLogin();
    }

}
