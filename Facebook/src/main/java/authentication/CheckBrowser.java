package authentication;

import base.CommonAPI;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBrowser extends CommonAPI {
    String url = "https://www.facebook.com";
   public String checkTitle() {
       String title = driver.getTitle();
       return title;
   }
}
