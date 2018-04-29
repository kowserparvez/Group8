package home.page;

import authentication.CheckBrowser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBrowser extends CheckBrowser {
    @Test
    public void TestTitle() {
        String a = checkTitle();
        Assert.assertEquals(a, "Facebook - Log In or Sign Up");
    }
}
    /*public void logIn(WebDriver driver) throws InterruptedException {
        LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.logInToFacebook(driver);
    }*/




    /*public void TestTitle() {
        String a = checkTitle();
        Assert.assertEquals(a, "Facebook - Log In or Sign Up");


    }
   // @Test
   // public void tests(){
   //      inputinFB();
  //  }
    //@Test
    //public void  testPassfield(){
      //  inputPass();

    //}
    //@Test
    //public void testLogButton(){
       // ClickLoginButton();
    //}
}
*/