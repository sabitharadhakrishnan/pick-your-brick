package com.pickyourbrick.brickstore.repository;

import com.pickyourbrick.brickstore.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity,Long> {
    ProductEntity findByProductId(int productId);
}
