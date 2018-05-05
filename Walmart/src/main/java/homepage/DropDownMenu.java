package homepage;

import base.CommonAPI;
import org.testng.Assert;
import reporting.TestLogger;
import utility.ConnectDB;

import java.util.List;

/**
 * @Author Kowser on 5/4/2018.
 */
public class DropDownMenu extends CommonAPI{

    public void dropDownMenu(){

        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//button[@id='listboxActive']");

        List<String > ddMenu = getTextFromWebElements(".SearchDropdown-flyout");
                for(String st : ddMenu){
                    System.out.println(st);
                }
                List<String> expetedMenuList = ddMenu ;
        Assert.assertEquals(ddMenu,expetedMenuList);

        ConnectDB connectDB = new ConnectDB();
        connectDB.InsertDataFromArryListToMySql(expetedMenuList,"tableone","Home");
    }


}
