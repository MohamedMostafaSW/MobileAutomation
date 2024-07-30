package gestures;

import InitializeTheAPP.OpenAPP;
import io.appium.java_client.AppiumBy;
import locatorsAndFunctions.ScrollingWebview;
import org.testng.annotations.Test;

public class Scrolling extends OpenAPP {

    @Test
    public void scrollToWebview() throws InterruptedException {
        ScrollingWebview scrolling = new ScrollingWebview(driver);
        scrolling.onlyclick();
        driver.findElement(AppiumBy
                .androidUIAutomator("new UiScrollable(new UiSelector())" +
                        ".scrollIntoView(text(\"WebView\"));"));
        Thread.sleep(2000);
    }



}
