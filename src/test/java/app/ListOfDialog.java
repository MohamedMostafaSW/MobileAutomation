package app;

import InitializeTheAPP.OpenAPP;
import locatorsAndFunctions.AppListOfDialog;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class ListOfDialog extends OpenAPP {
    @Test
    public void verifyCommondsWork() {
        AppListOfDialog appList = new AppListOfDialog(driver);
        DeviceRotation landscape = new DeviceRotation(0,0,90);
        driver.rotate(landscape);
        appList.selectCommondOne();
        Assert.assertEquals(appList.getMessge(),"You selected: 0 , Command one");

    }
}
