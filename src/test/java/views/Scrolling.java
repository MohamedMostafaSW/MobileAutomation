package views;

import InitializeTheAPP.OpenAPP;
import locatorsAndFunctionsApiDemo.ScrollingWebview;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scrolling extends OpenAPP {

    @Test
    public void scrollToWebview(){
        ScrollingWebview scrolling = new ScrollingWebview(driver);
        scrolling.onlyclick();
        scrollToSpecificText("WebView");
        Assert.assertTrue(scrolling.webViewAppear(),"scrolling done correctly");


    }



}
