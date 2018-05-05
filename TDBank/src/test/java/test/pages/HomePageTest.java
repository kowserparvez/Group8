package test.pages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import reporting.TestLogger;

/**
 * @Author Kowser on 4/24/2018.
 */
public class HomePageTest extends CommonAPI {
    @Test(enabled = false)
    public void testHome(){
        String url = getCurrentPageUrl();
        System.out.println(url);
    }

    @Test(enabled = false)
    public void testHome1(){
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.aboutUsElement();
    }

    @Test (enabled = false)
    public void testHome2(){
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.locationsElement();
    }

    @Test(enabled = false)
    public void testHome3(){
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.customerServiceElement();
    }

    @Test
    public void testHome4(){
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.spanishLanhuageElement();
    }
}
