package Home;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestUS extends ClickUS {
    @Test
    public void test3() {
        ClickUS sp = PageFactory.initElements ( driver, ClickUS.class );

        sp.us ();
    }
}
