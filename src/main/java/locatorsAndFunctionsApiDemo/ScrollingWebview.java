package locatorsAndFunctionsApiDemo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ScrollingWebview extends Perferences{
    public ScrollingWebview(AndroidDriver driver) {
        super(driver);
    }
    @AndroidFindBy(accessibility = "Views")
    private WebElement clickOnViews;
    public void onlyclick(){
        clickOnViews.click();
    }
    @AndroidFindBy(accessibility = "WebView")
    private WebElement webView;
    public boolean webViewAppear(){

        return webView.isDisplayed();
    }

}
