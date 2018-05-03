package homePage;

import base.CommonAPI;
public class CostcoHomeLinks extends CommonAPI {
    public void membership(){
    clickByXpath("//*[@id='footer-list']");
    navigateBack();
    clickByXpath("//*[@id=\"footer-list\"]/div/div[2]/ul[1]/li[3]/a");
    navigateBack();
    clickByXpath("//*[@id=\"footer-list\"]/div/div[2]/ul[1]/li[4]/a");
    navigateBack();
    clickByXpath("//*[@id=\"footer-list\"]/div/div[2]/ul[1]/li[5]/a");
    }//*[@id="footer-list"]/div/div[2]/ul[1]/li[2]/a
}
