package generalStore.perference;

import InitializeTheAPP.OpenAPP;
import locatorsAndFunctionsGeneralStore.Perferences;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SetWifiName extends OpenAPP {
    @Test
    public void firstTest() {
        Perferences perferences = new Perferences(driver);
        perferences.setWifiName("mostafa");
        Assert.assertEquals(perferences.WifiName(),"mostafa");
    }
}
