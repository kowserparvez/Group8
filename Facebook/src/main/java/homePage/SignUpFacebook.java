package homePage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class SignUpFacebook extends CommonAPI{
    public void inputField() throws InterruptedException {
        driver.findElement(By.name("firstname")).sendKeys("Carl");
        driver.findElement(By.name("lastname")).sendKeys("Steven");
        driver.findElement(By.name("reg_email__")).sendKeys("347677677");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123123qw");
        driver.findElement(By.name("birthday_day")).click();
        driver.findElement(By.xpath("//*[@id='day']/option[2]")).click();
        driver.findElement(By.xpath("//*[@id='year']")).click();
        driver.findElement(By.xpath("//*[@id='year']/option[2]")).click();
//        ////*[@id="year"]/option[1]
        driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
        driver.findElement(By.name("websubmit")).click();
    }
}
