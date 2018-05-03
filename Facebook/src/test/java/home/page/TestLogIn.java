package home.page;
import homePage.LogInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogIn extends LogInPage {
    @Test
    public void logIn()throws InterruptedException {
        LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.logInToFacebook();
    }
}