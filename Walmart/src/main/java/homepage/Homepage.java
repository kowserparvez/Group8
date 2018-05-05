package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

/**
 * @Author Kowser on 5/4/2018.
 */
public class Homepage extends CommonAPI{

    public void homeTitle(){
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Walmart.com | Save Money. Live Better.");
    }

    public void homeLogo(){
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Assert.assertTrue(driver.findElement(By.xpath("//a[@id='header-Logo']")).isDisplayed(),"Logo is not showing");
    }



}
