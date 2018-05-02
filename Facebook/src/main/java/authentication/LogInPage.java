package authentication;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends CommonAPI {
    @FindBy(css = ".inputtext")
    public WebElement userEmailInput;
    @FindBy(css = "#pass")
    public WebElement userPasswordInput;
    @FindBy(css ="#loginbutton")
    public WebElement clickLogInButtonElement;
    public WebElement getUserEmailInput() {
        return userEmailInput;
    }
    public void setUserEmailInput(WebElement userEmailInput) {
        this.userEmailInput = userEmailInput;
    }
    public WebElement getUserPasswordInput() {
        return userPasswordInput;
    }
    public void setUserPasswordInput(WebElement userPasswordInput) {
        this.userPasswordInput = userPasswordInput;
    }
    public WebElement getClickLogInButtonElement() {
        return clickLogInButtonElement;
    }
    public void setClickLogInButtonElement(WebElement clickLogInButtonElement) {
        this.clickLogInButtonElement = clickLogInButtonElement;
    }
    public void typeUserEmail() {
        getUserEmailInput().sendKeys("r_md26@yahoo.com");
    }
    public void typeUserPassword() {
        getUserPasswordInput().sendKeys("123123ZA#@");
    }
    public void clickOnAuthenticate() {
        getClickLogInButtonElement().click();
    }
    public void logInToFacebook() throws InterruptedException{
        typeUserEmail();
        typeUserPassword();
        clickOnAuthenticate();
        //checking git pus
    }
}



