package Home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI{
    @FindBy(id = "input_1")
    public static WebElement input;
    @FindBy(id ="input_2")
    public static WebElement password;

    //url verification
    public String URLVerification() throws InterruptedException{
        String url = "www.metroplus.com";
        url = driver.getCurrentUrl ();
        sleepFor ( 1 );
        return url;
    }

}
