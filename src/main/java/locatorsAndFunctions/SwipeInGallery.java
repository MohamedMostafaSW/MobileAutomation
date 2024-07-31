package locatorsAndFunctions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SwipeInGallery extends ScrollingWebview{
    public SwipeInGallery(AndroidDriver driver) {
        super(driver);
    }
    @AndroidFindBy(accessibility = "Gallery")
    private WebElement gallery;
    @AndroidFindBy(accessibility = "1. Photos")
    private WebElement photos;
    @AndroidFindBy(xpath = "(//android.widget.ImageView)[1]")
    public WebElement firstImage;

    public void goToPhotos(){
        onlyclick();
        gallery.click();
        photos.click();
    }
}
