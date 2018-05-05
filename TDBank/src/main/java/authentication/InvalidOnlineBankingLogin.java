package authentication;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.security.Key;

/**
 * @Author Kowser on 5/2/2018.
 */
public class InvalidOnlineBankingLogin extends CommonAPI{

   @FindBy (xpath = "//a[@id='OnlineLogin']")
    public WebElement signInBtn;

    @FindBy(xpath = "//input[@id='formElement_1']")
    public static WebElement userName;

    @FindBy(xpath = "//input[@id='formElement_2']")
    public static WebElement userPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement logInBtn;

    public static WebElement getUserName() {
        return userName;
    }

    public static void setUserName(WebElement userName) {
        InvalidOnlineBankingLogin.userName = userName;
    }

    public static WebElement getUserPassword() {
        return userPassword;
    }

    public static void setUserPassword(WebElement userPassword) {
        InvalidOnlineBankingLogin.userPassword = userPassword;
    }

    public static WebElement getLogInBtn() {
        return logInBtn;
    }

    public static void setLogInBtn(WebElement logInBtn) {
        InvalidOnlineBankingLogin.logInBtn = logInBtn;
    }

    public WebElement getSignInBtn() {

        return signInBtn;
    }

    public void setSignInBtn(WebElement signInBtn) {
        this.signInBtn = signInBtn;
    }

   public void InvalidLogin() {
       TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        OnlineBankingLogin onlineBankingLogin= PageFactory.initElements(driver,OnlineBankingLogin.class);
//        onlineBankingLogin.clickOnlineLogIn();
       //driver.findElement(By.xpath("//a[@id='OnlineLogin']")).click();
//       clickByXpath("//a[@id='OnlineLogin']");
//       getUserName().sendKeys("TestUser1");
//       getUserPassword().sendKeys("abcd1234");
//       JavascriptExecutor js = (JavascriptExecutor) driver;
//       js.executeScript("arguments[0].click();", getLogInBtn());
       getSignInBtn().click();
       getUserName().sendKeys("TestUser1", Keys.TAB);
       getUserPassword().sendKeys("abcd1234");
       getLogInBtn().click();
   }

}
