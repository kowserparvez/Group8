package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * @Author Kowser on 4/24/2018.
 */
public class HomePage extends CommonAPI{

    @FindBy (xpath = "")
    public WebElement totallinks;

    public WebElement getTotallinks() {
        return totallinks;
    }

    public void setTotallinks(WebElement totallinks) {
        this.totallinks = totallinks;
    }

    public void findAllLinks(){
      List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

    }

}
