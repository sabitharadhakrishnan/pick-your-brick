package com.pickyourbrick.brickstore.service.implementation;

import com.pickyourbrick.brickstore.dto.ProductDTO;
import com.pickyourbrick.brickstore.entity.ProductEntity;
import com.pickyourbrick.brickstore.repository.ProductRepository;
import com.pickyourbrick.brickstore.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImplementation implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        if (productRepository.findByProductId(productDTO.getProductId())!= null) throw new RuntimeException("Record already exists");
        ProductEntity productEntity = new ProductEntity();
        BeanUtils.copyProperties(productDTO, productEntity);

        ProductEntity storedProduct = productRepository.save(productEntity);
        ProductDTO returnValue = new ProductDTO();
        BeanUtils.copyProperties(storedProduct, returnValue);
        return returnValue;
    }
}
