package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;

public class CostcoEmailOffers extends CommonAPI {
    public void clickOnEmailOffer()throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='email-signup-dropdown']")).click();
        sleepFor(5);
        //driver.findElement(By.name("emailSignUp")).sendKeys("rahmanmd26@gmail.com");
    }
}
