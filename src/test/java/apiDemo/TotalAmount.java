package apiDemo;

import InitializeTheAPP.OpenAPP;
import locatorsAndFunctionsApiDemo.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TotalAmount extends OpenAPP {

    @Test
    public void sumProducts() throws InterruptedException {
        CartPage cart = new CartPage(driver);

        cart.enterValidName("Mohamed Mostafa");
        cart.startShopping();
        cart.selectSpecificProducts("Air Jordan 4 Retro");
        scrollToSpecificText("Air Jordan 9 Retro");
        cart.selectSpecificProducts("Air Jordan 9 Retro");
        cart.shoppingConfirmation();
        Assert.assertEquals(cart.getSum(), cart.sumSelectedProducts());
    }
}