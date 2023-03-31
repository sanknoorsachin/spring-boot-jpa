package com.example.jpa.repository;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.jpa.entity.Document;
import com.example.jpa.entity.Product;

@SpringBootTest
public class DocumentRepositoryTest {
	@Autowired
	private DocumentRepository documentRepository;
	
	@Test
	public void saveDocument() {
		Document doc= new Document();
		doc.setDocNumber("a201167");
		doc.setAccessLevel("public");
		
		Product prod = new Product();
		prod.setProductName("proliant");
		prod.setProductNumber("p0012");
		
		
		Product prod1 = new Product();
		prod1.setProductName("3par");
		prod1.setProductNumber("p00678");
		
		
		
		Product prod2 = new Product();
		prod2.setProductName("aruba");
		prod2.setProductNumber("p00200");
		
		List<Product> prodList= new ArrayList<>();
		prodList.add(prod);
		prodList.add(prod1);
		prodList.add(prod2);
		
		doc.setProducts(prodList);
		
		documentRepository.save(doc);
	}

}
