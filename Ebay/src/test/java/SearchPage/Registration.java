package SearchPage;

import Home.EbayRegis;
import Home.LogInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Registration extends EbayRegis {
    @Test
    public void test4() {
        EbayRegis registration = PageFactory.initElements ( driver, EbayRegis.class );

        registration.clickregTab ();
        registration.clickpersonal ();
        registration.EnterFirstName ();
        registration.clickLastName ();
        registration.EnterEmail ();
        registration.EnterPass ();
        registration.clickregis ();
    }

}
