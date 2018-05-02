package home.page;

import homePage.SearchItems;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearch extends SearchItems {
    @Test
    public void test2() throws InterruptedException {
        SearchItems searchItems = PageFactory.initElements(driver, SearchItems.class);
        searchItems.searchItems();
    }
}