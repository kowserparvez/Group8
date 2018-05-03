package facebookActivities;
import homePage.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

    public class ActivitiesOnFaceBook extends LogInPage {
        public void login()throws InterruptedException{
            LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
            logInPage.logInToFacebook();
        }
        public void viewMessge() throws InterruptedException {
            login();
            driver.findElement(By.xpath("//*[@id='navItem_217974574879787']/a/div")).click();
        }
        public void watchSaveVideo() throws InterruptedException {
            login();
            driver.findElement(By.xpath("//*[@id='navItem_2392950137']/a/div")).click();
        }
        public void viewFriendlists() throws InterruptedException {
            login();
            driver.findElement(By.xpath("//*[@id='navItem_1572366616371383']/a/div")).click();
            driver.findElement(By.xpath("//*[@id='pagelet_bookmark_seeall']/div/div/div[1]/div/div[1]/div/a[2]")).click();
        }
        public void viewEvents() throws InterruptedException {
            login();
            driver.findElement(By.xpath("//*[@id='navItem_2344061033']/a/div")).click();
        }
        public void vieGroups() throws InterruptedException {
            login();
            driver.findElement(By.xpath("//*[@id='navItem_1434659290104689']/a/div")).click();
        }
        public void viewPhotos() throws InterruptedException {
            login();
            driver.findElement(By.xpath("//*[@id='navItem_2305272732']/a/div")).click();
        }
        public void viewPageFeed() throws InterruptedException {
            login();
            driver.findElement(By.xpath("//*[@id='navItem_140472815972081']/a/div[2]")).click();
        }
        public void viewHome() throws InterruptedException {
            login();
            driver.findElement(By.xpath("//*[@id='u_0_c']/a")).click();
        }
    }