package perference;

import InitializeTheAPP.OpenAPP;
import locatorsAndFunctions.Perferences;
import org.testng.annotations.Test;



public class CopyAndPaste extends OpenAPP {
    @Test
    public void firstTest() {
        Perferences perferences= new Perferences(driver);
        perferences.copyWifiName("mostafa");

    }
}
