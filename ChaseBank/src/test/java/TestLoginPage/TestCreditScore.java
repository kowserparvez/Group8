package TestLoginPage;

import LogInPage.CreditScore;
import LogInPage.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCreditScore extends CreditScore {

    @Test
    public void test2() {
        CreditScore creditScore = PageFactory.initElements ( driver, CreditScore.class );
         ClickHamMenu ();

    }
}
