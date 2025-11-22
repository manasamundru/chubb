package com.ekart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ekart.model.Product;
import com.ekart.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	private ProductService productservice;
	
	@GetMapping
	public List<Product> getAllProducts(){
        return productservice.getAllProducts();
    }
	@GetMapping("{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){
        return new ResponseEntity<Product>(productservice.getProduct(id),HttpStatus.OK);
    }
	@PostMapping
    public ResponseEntity<Integer> saveProduct(@RequestBody Product product){
        return new ResponseEntity<Integer>(productservice.saveProduct(product), HttpStatus.CREATED);
    }
	@PutMapping("{id}")
    public ResponseEntity<Integer> updateProduct(@PathVariable int id,
                                                   @RequestBody Product product){
        return new ResponseEntity<Integer>(productservice.updateProduct(product,id),HttpStatus.OK);
    }
	@DeleteMapping("{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id){
		productservice.deleteProduct(id);
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
