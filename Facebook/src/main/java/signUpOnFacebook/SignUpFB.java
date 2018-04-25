package signUpOnFacebook;

import base.CommonAPI;
import org.openqa.selenium.By;

public class SignUpFB extends CommonAPI {
    public void SignUpFcaebook() {

        driver.findElement(By.cssSelector(".inputtext _58mg _5dba _2ph-")).sendKeys("testuser");
        driver.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys("Atomation");
        driver.findElement(By.xpath("//*[@id='u_0_p']")).sendKeys("rcoveridpass33@gmail.com");
        driver.findElement(By.xpath("//*[@id='u_0_w']")).sendKeys("123456abc");
        driver.findElement(By.xpath("//*[@id='u_0_w']")).sendKeys("123456abc");



    }

}
