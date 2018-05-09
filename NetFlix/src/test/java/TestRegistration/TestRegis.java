package TestRegistration;

import LogInPage.Registration;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestRegis extends Registration {

    @Test
    public void test1() {
        Registration rsregistration = PageFactory.initElements ( driver, Registration.class );

        rsregistration.click ();
        rsregistration.button ();
        rsregistration.button1 ();

    }

}
