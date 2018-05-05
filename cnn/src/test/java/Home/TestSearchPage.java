package Home;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearchPage extends SerchPage {
    @Test
    public void test2() {
        SerchPage sp = PageFactory.initElements ( driver, SerchPage.class );

        sp.search ();
    }
}