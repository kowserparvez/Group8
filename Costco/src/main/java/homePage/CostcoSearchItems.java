package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder;
import java.util.List;

public class CostcoSearchItems {
  @FindBy(how=How.CSS,using="#twotabsearchtextbox")
    public static WebElement searchInputWebElemnt;
  @FindBy(how=How.CSS,using=".'nav-input'")
    public static WebElement clickSearchWebBtn;
  @FindBy(how=How.CSS,using="#navigation-dropdown")
    public static WebElement clickOnSearchDropDownBtn;

  public static void clickOnSearchDropDownBox(){
      clickOnSearchDropDownBtn.click();
  }
  public void selectOnDropDownBox(){
      Select selectItems=new Select(clickOnSearchDropDownBtn);
      List<WebElement> list=selectItems.getOptions();

  }

}
