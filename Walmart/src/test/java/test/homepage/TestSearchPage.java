package test.homepage;

import base.CommonAPI;
import homepage.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

/**
 * @Author Kowser on 5/4/2018.
 */
public class TestSearchPage extends CommonAPI{
    @Test
    public void singleItemSearchTest(){
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);
        searchPage.searchAnItem();
    }
}
