package test.homepage;

import base.CommonAPI;
import homepage.MultipleItemsSearch;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @Author Kowser on 5/5/2018.
 */
public class TestMultipleItemsSearch extends CommonAPI{

    @Test
    public void searchingTest()throws InterruptedException{
        MultipleItemsSearch multipleItemsSearch = PageFactory.initElements(driver,MultipleItemsSearch.class);
        multipleItemsSearch.searchItems();
    }
}
