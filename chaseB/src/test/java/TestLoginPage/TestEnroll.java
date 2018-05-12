package TestLoginPage;

import LogInPage.EnrollForCreditReport;
import LogInPage.Login;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestEnroll extends EnrollForCreditReport {
    @Test
    public void test3(){
        EnrollForCreditReport enrollForCreditReport = PageFactory.initElements ( driver, EnrollForCreditReport.class );

        clickEnroll ();
    }
}
