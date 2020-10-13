package com.pickyourbrick.brickstore.ui.model;

public class ProductDetailsRequestModel {
    private int productId;
    private String name;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
