package authentication;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends CommonAPI {
public void inputinFB() {
    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("rsndom");
    driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("hello");
    driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
    driver.findElement(By.cssSelector(".inputtext 55r1 inputtext _1kbt _4rer inputtext _1kbt"));

}
/*public void inputPass() {
    driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("hello");
}
public void ClickLoginButton(){

    driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
}*/
}

