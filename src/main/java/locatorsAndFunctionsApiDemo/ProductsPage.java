package locatorsAndFunctionsApiDemo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends LoginPage {
    public ProductsPage(AndroidDriver driver) {
        super(driver);
    }



    public void selectSpecificProducts(String enterProduct) {
        List<WebElement> prd = driver.findElements(By.id("com.androidsample.generalstore:id/productName"));

        for (int i = 0; i < prd.size(); i++) {

            String aimPrd = prd.get(i).getText();
            if (aimPrd.equals(enterProduct)) {
                driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();

            }
        }

    }
    @AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    private WebElement marketIcon;

    public void shoppingConfirmation(){
        marketIcon.click();

    }

}

