package gestures;

import InitializeTheAPP.OpenAPP;
import locatorsAndFunctions.LongPress;
import org.testng.annotations.Test;

public class LongPressTest extends OpenAPP {
    @Test
    public void longPressGesture() throws InterruptedException {
        LongPress longPress =new LongPress(driver);
        longPress.longClickOnPeople();
        longPressMethod(longPress.clickOnPeople);

    }
}
