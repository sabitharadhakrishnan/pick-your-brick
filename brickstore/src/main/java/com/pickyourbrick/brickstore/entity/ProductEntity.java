package com.pickyourbrick.brickstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="products")
public class ProductEntity {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable=false, unique = true)
    private int productId;

    @Column(length = 50)
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
