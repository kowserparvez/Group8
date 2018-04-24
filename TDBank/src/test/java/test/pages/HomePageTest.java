package test.pages;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * @Author Kowser on 4/24/2018.
 */
public class HomePageTest extends CommonAPI {
    @Test
    public void testHome(){
        String url = getCurrentPageUrl();
        System.out.println(url);
    }
}
