package TestLoginPage;

import LogInPage.Login;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogin extends Login {
    @Test
    public void test1() {
        Login LogIn = PageFactory.initElements ( driver, Login.class );

        loginIFrame ();
        inputUser ();
        inputPassWord ();
        clickLogin ();
    }
}