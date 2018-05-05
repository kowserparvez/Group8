package test.homepage;

import base.CommonAPI;
import homepage.Homepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

/**
 * @Author Kowser on 5/4/2018.
 */
public class TestHomepage extends Homepage{

    @Test
    public void homeTitleTest() {
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeTitle();
    }

    @Test
    public void homeLogoTest(){
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeLogo();
    }

}
