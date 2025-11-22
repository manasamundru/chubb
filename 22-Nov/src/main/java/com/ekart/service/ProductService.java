package com.ekart.service;

import java.util.List;

import com.ekart.model.Product;

public interface ProductService {
      Integer saveProduct(Product product);
      List<Product> getAllProducts();
      Product getProduct(int id);
      void deleteProduct(int id);
      Integer updateProduct(Product product,int id);
}
