package apiDemo.skills;

import InitializeTheAPP.OpenAPP;
import locatorsAndFunctionsApiDemo.AppListOfDialog;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListInLandscapeMode extends OpenAPP {
    @Test
    public void verifyCommondsWork() {
        AppListOfDialog appList = new AppListOfDialog(driver);
        DeviceRotation landscape = new DeviceRotation(0,0,90);
        driver.rotate(landscape);
        appList.selectCommondOne();
        Assert.assertEquals(appList.getMessge(),"You selected: 0 , Command one");

    }
}
