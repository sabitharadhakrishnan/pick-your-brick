package com.brickstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Productsview implements ProductsViewCalibratable {
    private static final String URL = "localhost:3000";

    private Productsview() {
    }

    public static Productsview directnav() {
        Productsview productsView = new Productsview();
        productsView.load();
        return productsView ;
    }

    private void load() {
        UiHost.getInstance().load(URL);
    }

    @Override
    public String getHeading() {
        By locator = new By.ById("list");
        UiHost.getInstance().waitUntilVisible(locator);
        WebElement element = UiHost.getInstance().findElement(locator);
        return element == null ? "" : element.getText();
    }
}
