package generalStore;

import InitializeTheAPP.OpenAPP;
import locatorsAndFunctionsGeneralStore.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FillingForm extends OpenAPP {

    @Test
    public void fillTheForm(){
        LoginPage login =new LoginPage(driver);
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        login.enterValidName("Mohamed Mostafa");
        login.genderMale();
        login.openList();
        scrollToSpecificText("Egypt");
        wait.until(ExpectedConditions.elementToBeClickable(login.egypt));
        login.enterValidCountry();
        login.startShopping();
        wait.until(ExpectedConditions.invisibilityOf(login.products));
        Assert.assertTrue(login.productsPage());
    }

}
