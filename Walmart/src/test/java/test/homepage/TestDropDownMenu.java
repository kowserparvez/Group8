package test.homepage;

import homepage.DropDownMenu;
import org.testng.annotations.Test;
import reporting.TestLogger;

/**
 * @Author Kowser on 5/4/2018.
 */
public class TestDropDownMenu extends DropDownMenu{

    @Test
    public void testDropDownMenu(){
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dropDownMenu();
    }
}
