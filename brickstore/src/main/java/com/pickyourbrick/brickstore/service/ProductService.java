package com.pickyourbrick.brickstore.service;

import com.pickyourbrick.brickstore.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO createProduct(ProductDTO productDTO);

    List<ProductDTO> getProductList();
}
