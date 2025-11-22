package com.ekart.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekart.model.Product;
import com.ekart.repositories.ProductRepository;
import com.ekart.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Integer saveProduct(Product product) {
		Product savedProduct =  productRepository.save(product);
		return savedProduct.getId();
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	@Override
	public Product getProduct(int id) {
		Optional<Product> product = productRepository.findById(id);
		return product.orElseThrow(RuntimeException::new);
	}

	@Override
	public void deleteProduct(int id) {
		productRepository.deleteById(id);
		
	}

	@Override
	public Integer updateProduct(Product product, int id) {
		Product exsistingProduct = productRepository.findById(id).orElseThrow(RuntimeException::new);
		exsistingProduct.setBrand(product.getBrand());
		exsistingProduct.setDescription(product.getDescription());
		exsistingProduct.setName(product.getName());
		exsistingProduct.setGender(product.getGender());
		exsistingProduct.setCategory(product.getCategory());
		exsistingProduct.setSize(product.getSize());
		exsistingProduct.setColor(product.getColor());
		exsistingProduct.setPrice(product.getPrice());
		exsistingProduct.setDiscountPrice(product.getDiscountPrice());
		exsistingProduct.setInInventory(product.isInInventory());
		exsistingProduct.setItemsLeft(product.getItemsLeft());
		exsistingProduct.setImageURL(product.getImageURL());
		exsistingProduct.setSlug(product.getSlug());
		
		Product updatedProduct = productRepository.save(exsistingProduct);
		return updatedProduct.getId();  
		
		
	}

}
