package home.page;

import authentication.LogInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSignIn extends LogInPage {
    @Test
    public void logIn()throws InterruptedException {
        LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.logInToFacebook();
    }
}

