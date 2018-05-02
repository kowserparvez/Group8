package home.page;

import authentication.ForgotFbAccount;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestToForgetAccount extends ForgotFbAccount{
    @Test(priority = 1)
    public void testToForgotAcc()throws InterruptedException {
        ForgotFbAccount fb = PageFactory.initElements(driver, ForgotFbAccount.class);
        fb.clickOnForgotAcc("r_md26@yahoo.com");
    }
}
