package LogInPage;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends CommonAPI{
    @FindBy(xpath = "//button[@class='btn hero-cta-btn btn-large btn-red']")
    WebElement click;
    @FindBy(xpath ="//button[@type='button']")
    WebElement button;
   @FindBy(xpath = "//div[@placeholder='{\"id\":\"114001031\",\"selected\":false}']")
   WebElement choose;
    @FindBy(xpath = "//button[@type='button']")
    WebElement button1;

    public void click(){
        click.click ();
    }
    public void button(){
        button.click ();
    }
//    public void choose(){
//        choose.click ();
   // }
    public void button1(){
        button1.click ();
    }
}
