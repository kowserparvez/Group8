package title;

import base.CommonAPI;
import org.testng.Assert;

public class CheckTitle extends CommonAPI {
   public String checkTitle() {
       String title = driver.getTitle();
       return title;
   }
}
