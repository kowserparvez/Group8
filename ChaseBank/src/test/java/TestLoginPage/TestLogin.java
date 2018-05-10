package TestLoginPage;

import LogInPage.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogin extends LogIn {
    @Test
    public void test1() {
        LogIn LogIn = PageFactory.initElements ( driver, LogIn.class );

        loginIFrame ();
        inputUser ();
        inputPassWord ();
        clickLogin ();
    }
}