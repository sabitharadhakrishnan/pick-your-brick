package com.brickstore.data;

public class ProductsViewExpected implements ProductsViewCalibratable {

    private ProductsViewExpected() {
    }

    public static ProductsViewExpected getInstance() {
        ProductsViewExpected productsViewExpected = new ProductsViewExpected();
        return productsViewExpected;
    }

    @Override
    public String getHeading() {
        return "Product Catalog";
    }
}
