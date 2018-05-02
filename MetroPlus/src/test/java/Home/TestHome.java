package Home;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHome extends HomePage{

    @Test
    public void test1(){
        HomePage home = PageFactory.initElements ( driver,HomePage.class );

        home.clickByCss ( "sayed1970" );
    }
}
