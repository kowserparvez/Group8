package home.page;

import authentication.LogInPage;
import authentication.SignUpOnFacebook;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestToSignUp extends SignUpOnFacebook {
    @Test
    public void testSignUp() throws InterruptedException {
        inputField();
    }
}
