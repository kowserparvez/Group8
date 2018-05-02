package Home;

import base.CommonAPI;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayRegis extends CommonAPI{

    @FindBy(id = "regTab")
    WebElement regTab;
    @FindBy(id = "personal")
    WebElement personal;
    @FindBy(id = "firstname")
    WebElement firstname;
    @FindBy(id = "lastname")
    WebElement lastname;
    @FindBy(xpath = "//input[@name='email']")
    WebElement email;
    @FindBy(xpath = "//input[@name='PASSWORD']")
    WebElement pass;
    @FindBy(id = "ppaFormSbtBtn")
    WebElement regis;

}
