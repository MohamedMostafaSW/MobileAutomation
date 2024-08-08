package apiDemo;

import InitializeTheAPP.OpenAPP;
import locatorsAndFunctionsApiDemo.ProductsPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ScrollingToProduct extends OpenAPP {

    @Test
    public void scrolling(){
        ProductsPage product = new ProductsPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        product.enterValidName("Mohamed Mostafa");
        product.genderMale();
        product.startShopping();
        scrollToSpecificText("Jordan 6 Rings");
        product.selectSpecificProducts("Jordan 6 Rings");
        product.shoppingConfirmation();

    }
}
