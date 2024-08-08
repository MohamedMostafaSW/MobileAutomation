package generalStore.perference;

import InitializeTheAPP.OpenAPP;
import locatorsAndFunctionsGeneralStore.Perferences;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CopyAndPaste extends OpenAPP {
    @Test
    public void firstTest() {
        Perferences perferences= new Perferences(driver);
        openPage("io.appium.android.apis",
                "io.appium.android.apis.preference.PreferenceDependencies",
                "io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies");
        perferences.copyWifiName("mostafa");
        Assert.assertEquals(perferences.WifiName(),"mostafa\uE005");

    }
}
