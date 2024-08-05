package views;

import InitializeTheAPP.OpenAPP;
import locatorsAndFunctionsApiDemo.SwipeInGallery;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Swipe extends OpenAPP {

    @Test
    public void swipe()  {
        SwipeInGallery swipe =new SwipeInGallery(driver);
        swipe.goToPhotos();
        Assert.assertEquals(swipe.firstImage.getAttribute("focusable"),"true");
        swipeMethod(swipe.firstImage,"left");
        Assert.assertEquals(swipe.firstImage.getAttribute("focusable"),"false");

    }


}
