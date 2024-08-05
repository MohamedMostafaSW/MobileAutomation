package locatorsAndFunctionsGeneralStore;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    AndroidDriver driver;
    public LoginPage (AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    private WebElement name;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioMale")
    private WebElement male;

    @AndroidFindBy(id = "android:id/text1")
    private WebElement country;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Egypt\"]")
    public WebElement egypt;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    private WebElement letsShoppingButton;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/toolbar_title")
    public WebElement products;

    public void enterValidName(String enterName){
        name.sendKeys(enterName);
        driver.hideKeyboard();
    }
    public void genderMale(){
        male.click();
    }
    public void openList(){
        country.click();
    }
    public void enterValidCountry(){
        egypt.click();
    }
    public void startShopping(){
        letsShoppingButton.click();
    }
    public boolean productsPage(){
        return products.isDisplayed();
    }


}
