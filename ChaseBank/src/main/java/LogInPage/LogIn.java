package LogInPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LogIn extends CommonAPI {
    @FindBy(id = "logonbox")
    WebElement logonBox;
    @FindBy(id = "usr_name_home")
    WebElement UserName;
    @FindBy(id = "usr_password_home")
    WebElement pass;


    public void loginIFrame() {
        driver.switchTo ().frame ( driver.findElement ( By.id ( "logonbox" ) ) );
    }
    public void inputUser() {
        typeByXpath ( "//*[@ id=\"userId-input-field\"]", "tahir" );
    }
    public void inputPassWord() {
        typeByXpath ( "//*[@id=\"password-input-field\"]", "1234" );
    }
    public void clickLogin() {
        clickByXpath ( "//*[@id=\"signin-button\"]/span" );
    }
}
