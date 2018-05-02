package authentication.test;

import authentication.SignInOnCostco;
import org.testng.annotations.Test;

public class TestToSignInOnCostco extends SignInOnCostco {
    @Test
   public void testSignIn(){
        costcoSignIn();
    }
}
