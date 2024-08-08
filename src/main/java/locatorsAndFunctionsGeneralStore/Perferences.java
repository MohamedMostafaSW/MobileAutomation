package locatorsAndFunctionsGeneralStore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Perferences {

    AndroidDriver driver;
    public Perferences(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(accessibility ="Preference")
    private WebElement clickOnPerferences;

    @AndroidFindBy(accessibility = "3. Preference dependencies")
    private WebElement clickOnDependencies;

    @AndroidFindBy(id = "android:id/checkbox")
    private WebElement clicOnCheckBox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WiFi settings']")
    private WebElement clickOnWifi;

    @AndroidFindBy(id = "android:id/edit")
    private WebElement sendName;

    @AndroidFindBy(id = "android:id/button1")
    private WebElement clickOnOK;

    public void setWifiName(String enterWifiName){
        clickOnPerferences.click();
        clickOnDependencies.click();
        clicOnCheckBox.click();
        clickOnWifi.click();
        sendName.sendKeys(enterWifiName);
        wifiName=sendName.getText();
        clickOnOK.click();
    }
    public void copyWifiName(String enterWifiName) {
        clickOnPerferences.click();
        clickOnDependencies.click();
        clicOnCheckBox.click();
        clickOnWifi.click();
        sendName.sendKeys(enterWifiName);
        driver.setClipboardText(sendName.getText());
        sendName.sendKeys(Keys.CLEAR);
        driver.getClipboardText();
        wifiName=sendName.getText();
        clickOnOK.click();
    }
    String wifiName;
    public String WifiName(){
        return wifiName;
    }
}
