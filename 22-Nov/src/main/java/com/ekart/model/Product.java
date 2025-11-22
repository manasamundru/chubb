package com.ekart.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "products")
public class Product {
	@Id
	private int id;
	private String name;
	private String description;
	private String brand;
	private Gender gender;
    private Category category;
    private List<Integer> size;
    private List<String> color;
    private Double price;
    private Double discountPrice;
    private boolean inInventory;
    private Integer itemsLeft;
    private String imageURL;
    private String slug;
      
}
