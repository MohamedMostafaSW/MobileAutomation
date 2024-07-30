package locatorsAndFunctions;

import dev.failsafe.internal.util.Assert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LongPress extends Perferences  {

    public LongPress(AndroidDriver driver) {
        super(driver);
    }
    @AndroidFindBy(accessibility = "Views")
    private WebElement clickOnViews;

    @AndroidFindBy(accessibility = "Expandable Lists")
    private WebElement clickOnExpandable;

    @AndroidFindBy(accessibility = "1. Custom Adapter")
    private WebElement clickOnCustom;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='People Names']")
    public WebElement clickOnPeople;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sample menu']")
    private WebElement sampleDisplay;

    public void longClickOnPeople(){
        clickOnViews.click();
        clickOnExpandable.click();
        clickOnCustom.click();
    }


}
