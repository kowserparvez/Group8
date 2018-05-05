package test.homepage;

import base.CommonAPI;
import homepage.MultiUsingExcel;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

/**
 * @Author Kowser on 5/5/2018.
 */
public class TestMultiUsingExcel extends CommonAPI {


    @Test
    public void testWithExcel() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        MultiUsingExcel multiUsingExcel = PageFactory.initElements(driver, MultiUsingExcel.class);
        multiUsingExcel.searchWithExcel();

    }
}
