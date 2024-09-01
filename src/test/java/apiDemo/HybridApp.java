package apiDemo;

import InitializeTheAPP.OpenAPP;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import locatorsAndFunctionsApiDemo.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.Set;

public class HybridApp extends OpenAPP {

    @Test
    public void sumProducts() throws InterruptedException {
        CartPage cart = new CartPage(driver);

        cart.enterValidName("Mohamed mahmoid");
        cart.startShopping();
        cart.selectSpecificProducts("Air Jordan 4 Retro");
        scrollToSpecificText("Air Jordan 9 Retro");
        cart.selectSpecificProducts("Air Jordan 9 Retro");
        cart.shoppingConfirmation();
        cart.goToWebView();
        Thread.sleep(5000);
        Set<String> context =driver.getContextHandles();
        for (String contextName : context){
            System.out.println(contextName);
        }
        driver.context("WEBVIEW_com.androidsample.generalstore");
        driver.findElement(By.id("input")).sendKeys("youtube");
        driver.findElement(By.id("input")).sendKeys(Keys.ENTER);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        Thread.sleep(5000);

    }
}