package com.yr.mongo.repository;


import com.yr.mongo.model.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, String> {
    
    @Override
    void delete(Product product);
    
}
