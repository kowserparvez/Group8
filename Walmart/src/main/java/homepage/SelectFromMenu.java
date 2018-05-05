package homepage;

import base.CommonAPI;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;


/**
 * @Author Kowser on 5/4/2018.
 */
public class SelectFromMenu extends CommonAPI{

    public void selectFromMenu(){
       driver.findElement(By.xpath("//button[@id='listboxActive']"));
       //clickByXpath();



    }
}
