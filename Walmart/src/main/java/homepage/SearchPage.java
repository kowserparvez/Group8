package homepage;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

/**
 * @Author Kowser on 5/4/2018.
 */
public class SearchPage extends CommonAPI {

    @FindBy (css = "#global-search-input")
    public WebElement searchWindow;

    public WebElement getSearchWindow() {
        return searchWindow;
    }

    public void setSearchWindow(WebElement searchWindow) {
        this.searchWindow = searchWindow;
    }

    public void searchAnItem(){
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchWindow().sendKeys("baby bottles", Keys.ENTER);
    }

}
