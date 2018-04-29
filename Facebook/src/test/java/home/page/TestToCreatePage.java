package home.page;

import authentication.CreatePage;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestToCreatePage extends CreatePage {
    @Test
    public void testCreatePage()throws InterruptedException{
        clickOnCreatePage();

    }
}
