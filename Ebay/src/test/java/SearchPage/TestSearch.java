//package SearchPage;
//
//import Home.HomePage;
//import Home.SearchPage;
//import Home.LogInPage;
//import org.testng.annotations.Test;
//import org.openqa.selenium.support.PageFactory;
//
//public class TestSearch extends SearchPage {
//    @Test
//    public void test1() {
//        SearchPage hp = PageFactory.initElements ( driver, SearchPage.class );
//        hp.
//
//        }
//    }

package SearchPage;

import Home.LogInPage;
import base.CommonAPI;
import Home.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestSearch extends CommonAPI {

    @Test
    public void test2() throws InterruptedException {
        SearchPage searchPage = PageFactory.initElements ( driver, SearchPage.class );
        searchPage.searchItems ();
    }
    @Test
    public void test3() throws InterruptedException, IOException {
        TestLogger.log ( getClass ().getSimpleName () + ": " + convertToString ( new Object () {
        }.getClass ().getEnclosingMethod ().getName () ) );
        SearchPage searchPage = PageFactory.initElements ( driver, SearchPage.class );
        searchPage.searchItemsAndSubmitButton ();
    }

}

