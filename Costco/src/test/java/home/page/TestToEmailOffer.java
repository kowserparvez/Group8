package home.page;

import homePage.CostcoEmailOffers;
import org.testng.annotations.Test;

public class TestToEmailOffer extends CostcoEmailOffers {
    @Test
    public void emailOffer() throws InterruptedException {
        clickOnEmailOffer();
    }
}
