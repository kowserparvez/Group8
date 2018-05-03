package home.page;

import homePage.SignInOnCostco;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestToSignIn extends SignInOnCostco {
    @Test
    public void testSignIn() {
        SignInOnCostco signInOnCostco= PageFactory.initElements(driver,SignInOnCostco.class);
        signInOnCostco.signInOnCostco();
    }
}


// //LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
//            //logInPage.logInToFacebook();