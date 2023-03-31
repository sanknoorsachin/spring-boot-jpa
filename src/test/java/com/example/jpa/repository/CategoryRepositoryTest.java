package com.example.jpa.repository;



import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.jpa.entity.Brand;
import com.example.jpa.entity.Category;

@SpringBootTest
public class CategoryRepositoryTest {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private BrandRepository brandRepository;
	
	
	@Test
	public void saveBrandAndCategoryData() {
		
		//create a category
		
		  Category category = new Category(); category.setCategory_name("Shoes");
		  category.setDescription("Sports Edition");
		 
		
		Category category1 = new Category();
		category1.setCategory_name("Foot wear");
		category1.setDescription("Casual");
		
		
		//create a brand1
		Brand brand = new Brand();
		brand.setBrand_name("Puma");
		
		//create brand2
		Brand brand1 = new Brand();
		brand1.setBrand_name("Nike");
		
        //create a brand3
		Brand brand2 = new Brand();
		brand2.setBrand_name("Addidas");
		
		category.getBrand().add(brand);
		category.getBrand().add(brand1);
		category.getBrand().add(brand2);
	
		category1.getBrand().add(brand);
		category1.getBrand().add(brand1);
		
		
		
		brand.getCategory().add(category);
		brand1.getCategory().add(category);
		brand2.getCategory().add(category);
		
		brand.getCategory().add(category1);
		brand1.getCategory().add(category1);
	
		
		
		categoryRepository.save(category);
		categoryRepository.save(category1);
		
		
	   
	}
	@Test
	public void getBrandNamesForCategory() {
		
		List<String> data= categoryRepository.getBrandNameOnCategoryName("Foot wear");
		
		System.out.println(data);
		
	}
	
}
