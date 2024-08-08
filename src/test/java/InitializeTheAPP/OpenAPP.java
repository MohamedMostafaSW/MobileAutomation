package InitializeTheAPP;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

public class OpenAPP {
    public AppiumDriverLocalService service;
    public AndroidDriver driver;

    @BeforeClass
    public void openApp() throws URISyntaxException, MalformedURLException {
        service = new AppiumServiceBuilder().withAppiumJS(
                        new File("C:\\Users\\Mohamed Mostafa\\AppData\\Roaming\\npm\\node_modules\\appium" +
                                "\\build\\lib\\main.js"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723).build();
        service.start();
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("locatorsAndFunctionsGeneralStore");
        options.setChromedriverExecutable("C:\\Users\\Mohamed Mostafa\\Downloads\\chrome-win64\\chrome.exe");
        // options.setApp("C:\\Users\\Mohamed Mostafa\\Downloads\\APKFiles (1)\\resources\\ApiDemos-debug.apk");
        options.setApp("C:\\Users\\Mohamed Mostafa\\Downloads\\APKFiles (1)\\resources\\General-Store.apk");
        driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void longPressMethod(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(), "duration", 2000));
    }

    public void swipeMethod(WebElement element, String direction) {
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "direction", direction,
                "percent", 0.25));
    }

    public void dragAndDropMethod(WebElement element, int putX, int putY) {
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "endX", putX,
                "endY", putY));
    }

    public void scrollToSpecificText(String enterName) {
        driver.findElement(AppiumBy
                .androidUIAutomator("new UiScrollable(new UiSelector())" +
                        ".scrollIntoView(text(\"" + enterName + "\"));"));
    }

    public double getformatAmount(String amount) {
        Double price = Double.parseDouble(amount.substring(1));
        return price;
    }

    public void openPage(String packageName, String activityName, String packageAndActivityName) {
        Activity activity = new Activity(packageName, activityName);
        ((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of(
                "intent", packageAndActivityName));
    }

    @AfterClass
    public void teardown() {
        driver.quit();
        service.stop();
    }
}
