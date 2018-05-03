package Home;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHome extends HomePage {

        @Test
        public void test1() {
           // HomePage home = PageFactory.initElements ( driver, HomePage.class);
            HomePage hp = PageFactory.initElements ( driver, HomePage.class );
            //LogInPage login = PageFactory.initElements ( driver, LogInPage.class );

           // home.menu ();
            hp.search ();
            //login.clicksgnBt ();


        }

    }


