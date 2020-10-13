package com.pickyourbrick.brickstore.ui.controller;

import com.pickyourbrick.brickstore.dto.ProductDTO;
import com.pickyourbrick.brickstore.service.ProductService;
import com.pickyourbrick.brickstore.ui.model.ProductDetailsRequestModel;
import com.pickyourbrick.brickstore.ui.model.ProductDetailsResponseModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
@CrossOrigin(origins= {"http://localhost:3000"})
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ProductDetailsResponseModel createProduct(@RequestBody ProductDetailsRequestModel productDetails){
        ProductDetailsResponseModel returnValue = new ProductDetailsResponseModel();

        ProductDTO productDTO = new ProductDTO();
        BeanUtils.copyProperties(productDetails, productDTO);

        ProductDTO createdProduct = productService.createProduct(productDTO);
        BeanUtils.copyProperties(createdProduct, returnValue);
        return returnValue;
    }
}
