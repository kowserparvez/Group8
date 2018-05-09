package SearchPage;
import Home.LogInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogIn extends LogInPage {
    @Test
    public void test1() {
        LogInPage LogIn = PageFactory.initElements ( driver, LogInPage.class );

        LogIn.enterUserid ();
        LogIn.enterPass ();
        LogIn.clicksgnBt ();
    }
}
