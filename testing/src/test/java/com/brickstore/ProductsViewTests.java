package com.brickstore;

import com.brickstore.data.ProductsViewExpected;
import com.brickstore.data.Productsview;
import com.brickstore.data.UiHost;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ProductsViewTests {
    @Test(groups = {"smoke", "acceptance", "release"})
    public void validateHeading(){
        String expected = ProductsViewExpected.getInstance().getHeading();
        String actual = Productsview.directnav().getHeading();
        Assert.assertEquals(actual,expected);
    }
    @AfterMethod(alwaysRun = true)
    private void terminate() {
        UiHost.getInstance().close();
    }
}
