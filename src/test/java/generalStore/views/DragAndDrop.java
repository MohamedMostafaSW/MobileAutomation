package generalStore.views;

import InitializeTheAPP.OpenAPP;
import locatorsAndFunctionsGeneralStore.DragAndDropELe;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop extends OpenAPP {

    @Test
    public void moveCircle(){
    DragAndDropELe dropELe=new DragAndDropELe(driver);
    dropELe.dragAndDropCircle();
    dragAndDropMethod(dropELe.circle,717,660);
    Assert.assertEquals(dropELe.getDropText(),"Dropped!");



    }
}
