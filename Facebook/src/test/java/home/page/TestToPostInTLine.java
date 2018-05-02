package home.page;
import authentication.LogInPage;
import authentication.PostInTimeLine;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestToPostInTLine  extends PostInTimeLine  {
    @Test
    public void TextToPost()throws InterruptedException {
        facebookStatus();
    }
}
