package LogInPage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnrollRegistration extends CommonAPI {

    @FindBy(xpath = "//input[@name='tl.username']")
    WebElement CreateUserName;
    @FindBy(xpath = "//input[@name='tl.password']")
    WebElement CreatePass;
    @FindBy(xpath = "//input[@name='tl.first-name']")
    WebElement FirstName;
    @FindBy(xpath = "//input[@name='tl.middle-name']")
    WebElement MiddleName;
    @FindBy(xpath ="//*[@data-pt-name='cc_lastname']")
    WebElement LastName;
    @FindBy(xpath = "//*[@data-pt-name='cc_question']")
    WebElement ClickQuestion;
    @FindBy(xpath = "//*[@data-pt-name='cc_answer']")
    WebElement Answer;
    @FindBy(xpath = "//input[@name='tl.email-address']")
    WebElement Email;
    @FindBy(id ="enroll-Submit")
    WebElement Submit;

    public void CreateUserName(){
        typeByXpath ( "//input[@name='tl.username']" , "Sayed2018");
    }
    public void CreatePass(){
        typeByXpath ( "//input[@name='tl.password']" ,"Abcd1234@");
    }
    public void InputFirstName(){
        typeByXpath ( "//input[@name='tl.first-name']" ,"Sayed");
    }

    public void InputMiddleName(){
        typeByXpath ( "//input[@name='tl.middle-name']" ,"MD");
    }
    public void InputLastName(){
        typeByXpath ( "//*[@data-pt-name='cc_lastname']","Siddeque" );
    }
    public void clickQuestion(){
        typeByXpath ( "//*[@data-pt-name='cc_question']" ,"What city were you born in?");
    }
    public void SelectAnswer(){
        typeByXpath ( "//*[@data-pt-name='cc_answer']","New York" );
    }
    public void TypeEmail(){
        typeByXpath ( "//input[@name='tl.email-address']" ,"sayedsiddeque@gmail.com");
    }
    public void clickSubmit(){
        clickByXpath ( "//*[@data-pt-name='cc_continuebtn']" );
    }
}
