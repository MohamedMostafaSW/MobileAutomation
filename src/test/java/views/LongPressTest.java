package views;

import InitializeTheAPP.OpenAPP;
import locatorsAndFunctionsApiDemo.LongPress;
import org.testng.annotations.Test;

public class LongPressTest extends OpenAPP {
    @Test
    public void longPressGesture() {
        LongPress longPress =new LongPress(driver);
        longPress.longClickOnPeople();
        longPressMethod(longPress.clickOnPeople);

    }
}
