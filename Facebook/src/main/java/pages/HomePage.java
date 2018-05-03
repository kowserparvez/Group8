package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

/**
 * @Author Kowser on 4/24/2018.
 */
public class HomePage extends CommonAPI{

    @FindBy (xpath = "//a[@title='About Us']")
    public static WebElement aboutUs;

    @FindBy (xpath = "//a[@title='Locations']")
    public static WebElement locAtions;

    @FindBy (xpath = "//a[@title='Customer Service']")
    public static WebElement customerService;

    @FindBy (linkText = "En Español")
    public static WebElement enEspanol;


    public static WebElement getAboutUs() {
        return aboutUs;
    }

    public static void setAboutUs(WebElement aboutUs) {
        HomePage.aboutUs = aboutUs;
    }

    public static WebElement getLocAtions() {
        return locAtions;
    }

    public static void setLocAtions(WebElement locAtions) {
        HomePage.locAtions = locAtions;
    }

    public static WebElement getCustomerService() {
        return customerService;
    }

    public static void setCustomerService(WebElement customerService) {
        HomePage.customerService = customerService;
    }

    public static WebElement getEnEspanol() {
        return enEspanol;
    }

    public static void setEnEspanol(WebElement enEspanol) {
        HomePage.enEspanol = enEspanol;
    }

    public void aboutUsElement(){
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAboutUs().click();

    }

    public void locationsElement(){
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLocAtions().click();

    }

    public void customerServiceElement(){
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCustomerService().click();

    }

    public void spanishLanhuageElement(){
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getEnEspanol().click();
    }
}
