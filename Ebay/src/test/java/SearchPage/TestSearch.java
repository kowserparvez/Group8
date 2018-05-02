package SearchPage;

import Home.HomePage;
import Home.SearchPage;
import Home.LogInPage;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

public class TestSearch extends SearchPage {
    @Test
    public void test1() {
        HomePage home = PageFactory.initElements ( driver, HomePage.class);
        LogInPage login = PageFactory.initElements ( driver, LogInPage.class );
        SearchPage hp = PageFactory.initElements ( driver, SearchPage.class );

       home.clickLogin ();
       login.clicksgnBt ();
       hp.searchBox ();

        }

    }





