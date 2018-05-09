package Home;

import org.openqa.selenium.By;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class EbayRegis extends CommonAPI {
    @FindBy(xpath = "//span[@class='ml51 tx']")
    WebElement regTab;
    @FindBy(id = "personal")
    WebElement personal;
    @FindBy(xpath = "//input[@name='firstname']")
    WebElement firstname;
    @FindBy(id = "lastname")
    WebElement lastname;
    @FindBy(xpath = "//input[@name='email']")
    WebElement email;
    @FindBy(xpath = "//input[@name='PASSWORD']")
    WebElement pass;
    @FindBy(id = "ppaFormSbtBtn")
    WebElement regis;

    public void clickregTab() {
        regTab.click ();
    }
    public void clickpersonal(){
        personal.click ();
    }
    public void EnterFirstName(){
        firstname.sendKeys ( "Sayed" );
    }
    public void clickLastName(){
        lastname.sendKeys ( "Siddeque" );
    }
    public void EnterEmail(){
        email.sendKeys ( "sayedsiddeque@gmail.com" );
    }
    public void EnterPass(){
        pass.sendKeys ( "abc123" );
    }
    public void clickregis(){
        regis.click ();
    }

}
