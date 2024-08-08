package locatorsAndFunctionsGeneralStore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AppListOfDialog {
    AndroidDriver driver;
    public AppListOfDialog(AndroidDriver driver) {
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }
    @AndroidFindBy(accessibility = "App")
    private WebElement app;
    @AndroidFindBy(accessibility = "Alert Dialogs")
    public WebElement alert;
    @AndroidFindBy(accessibility = "List dialog")
    private WebElement list;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Command one\"]")
    private WebElement commandOne;
    @AndroidFindBy(id="android:id/message")
    private WebElement message;

    public void selectCommondOne(){
        app.click();
        alert.click();
        list.click();
        commandOne.click();
    }
    public String getMessge(){
        return message.getText();
    }
}
