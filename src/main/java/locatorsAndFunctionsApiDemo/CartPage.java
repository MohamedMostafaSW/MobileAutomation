package locatorsAndFunctionsApiDemo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends ProductsPage {
    public CartPage(AndroidDriver driver) {
        super(driver);
    }

    private List<WebElement> prices() {
        return driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/totalAmountLbl")
    private WebElement totalPrice;

    public double getSum() {
        String total = totalPrice.getText();
        return Double.parseDouble(total.substring(1));
    }

    public void selectProducts(String enterProduct) {
        selectSpecificProducts(enterProduct);
    }
    public double sumSelectedProducts(){
        int productPrices = prices().size();
        double sum = 0;
        for (int i = 0; i < productPrices; i++) {
            String removeDollar = prices().get(i).getText();
            Double sumPrices = Double.parseDouble(removeDollar.substring(1));
            sum = sum + sumPrices;
        }
        return sum;
    }
    @AndroidFindBy(className = "android.widget.CheckBox")
    private WebElement linkToSendEmail;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnProceed")
    private WebElement visitWebsite;
    public void goToWebView(){
        linkToSendEmail.click();
        visitWebsite.click();
    }

}

