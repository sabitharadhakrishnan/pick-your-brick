package com.brickstore;

public class ProductsViewExpected implements ProductsViewCalibratable {

    private ProductsViewExpected() {
    }

    public static ProductsViewExpected getInstance() {
        return new ProductsViewExpected();
    }

    @Override
    public String getHeading() {
        return "Product Catalog";
    }
}
