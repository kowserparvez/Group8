package facebook.activities;

import authentication.LogInPage;
import base.CommonAPI;
import faceboo.activities.ActivitiesOnFaceBook;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestToFaceBookActivities extends ActivitiesOnFaceBook {
    @Test //1
   public void checkMessage()throws InterruptedException{
       viewMessge();
   }
   @Test
   public void seeVideo() throws InterruptedException {
       watchSaveVideo();
   }
   @Test
   public void seeFriendlists() throws InterruptedException {
       viewFriendlists();
   }
   @Test
   public void seeEvents() throws InterruptedException {
       viewEvents();
   }
  // @Test
   public void seeGroupList() throws InterruptedException {
       vieGroups();
   }
    @Test
    public void seePhotos() throws InterruptedException {
        viewPhotos();
    }
    @Test
    public void SeeNewsfeed() throws InterruptedException {
        viewPageFeed();
    }
    @Test
    public void clickHomeButton() throws InterruptedException {
        viewHome();
    }
}
