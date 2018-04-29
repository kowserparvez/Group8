package authentication;


import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreatePage extends LogInPage{
    public void clickOnCreatePage() throws InterruptedException {
        LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.logInToFacebook();
        driver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();

        //driver.findElement(By.xpath("//*[@id='organization']/div/div[1]/div")).click();
    }
 }


