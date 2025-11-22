package com.ekart.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ekart.model.Product;

public interface ProductRepository extends MongoRepository<Product,Integer> {

}
