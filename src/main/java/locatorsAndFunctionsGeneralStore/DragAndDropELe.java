package locatorsAndFunctionsGeneralStore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DragAndDropELe extends ScrollingWebview{
    public DragAndDropELe(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Drag and Drop")
    private WebElement DragAndDrop;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_1")
    public WebElement circle;
    @AndroidFindBy(id = "io.appium.android.apis:id/drag_result_text")
    private WebElement dropTextAppear;

    public String getDropText(){
       return dropTextAppear.getText();
    }

    public void dragAndDropCircle(){
        onlyclick();
        DragAndDrop.click();

    }
}
