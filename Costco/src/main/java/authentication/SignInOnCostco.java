package authentication;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInOnCostco extends CommonAPI {
    @FindBy(xpath="//*[@id='header_sign_in']")
    public WebElement clickSignIn;
    @FindBy(css=".ctHidden form-control")
    public WebElement userEmailInput;
    @FindBy(css=".inputtext")
    public WebElement userPassWordInput;
    @FindBy(css=".primary")
    public WebElement clickSignInButton;
    public WebElement getClickSignIn() {
        return clickSignIn;
    }
    public void myAccount(){
        clickByLinkedText("Account");
    }
    public void setClickSignIn(WebElement clickSignIn) {
        this.clickSignIn = clickSignIn;
    }
    public WebElement getUserEmailInput() {
        return userEmailInput;
    }
    public void setUserEmailInput(WebElement userEmailInput) {
        this.userEmailInput = userEmailInput;
    }
    public WebElement getUserPassWordInput() {
        return userPassWordInput;
    }
    public void setUserPassWordInput(WebElement userPassWordInput) {
        this.userPassWordInput = userPassWordInput;
    }
    public WebElement getClickSignInButton() {
        return clickSignInButton;
    }
    public void setClickSignInButton(WebElement clickSignInButton) {
        this.clickSignInButton = clickSignInButton;
    }

    public void clickOnSignIn() { getClickSignIn().click(); }
    public void typeUserEmail(){
        getUserEmailInput().sendKeys("rahmanmd26@gmail,com");
    }
    public void typeUserPassword(){
        getUserPassWordInput().sendKeys("12345abc");
    }
    public void clickSignInButton(){
        getClickSignInButton().click();
    }
    public void costcoSignIn(){

       clickOnSignIn();
       typeUserEmail();
       typeUserPassword();
       clickSignInButton();
    }
}