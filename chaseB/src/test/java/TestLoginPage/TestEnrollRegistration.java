package TestLoginPage;

import LogInPage.EnrollForCreditReport;
import LogInPage.EnrollRegistration;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestEnrollRegistration extends EnrollRegistration {
    @Test
    public void test4() {
        EnrollForCreditReport enrollForCreditReport = PageFactory.initElements ( driver, EnrollForCreditReport.class );

        CreateUserName ();
        CreatePass ();
        InputFirstName ();
        InputMiddleName ();
        InputLastName ();
        clickQuestion ();
        SelectAnswer ();
        TypeEmail ();
        clickSubmit ();

    }
}
