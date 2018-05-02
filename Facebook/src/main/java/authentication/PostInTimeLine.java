package authentication;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class PostInTimeLine extends CommonAPI {

    @FindBy(css="._1mwp.navigationFocus _395 _1mwq _4c_p _5bu_ _34nd _21mu _5yk1")
            // .//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")
    public WebElement textToPost;
    @FindBy(css = ".Post")
    public WebElement clickOnpost;

    public WebElement getTextToPost() { return textToPost; }
    public void setTextToPost(WebElement textToPost) { this.textToPost = textToPost; }
    public WebElement getClickOnpost() { return clickOnpost; }
    public void setClickOnpost(WebElement clickOnpost) { this.clickOnpost = clickOnpost; }
    public void typeText(){ getTextToPost().sendKeys("What a beautiful day!"); }
    public void clickPost(){ getClickOnpost().click(); }
    public void facebookStatus()throws InterruptedException{
        LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.logInToFacebook();
        typeText();
        clickPost();
    }
}



