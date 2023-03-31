package com.example.jpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.jpa.entity.Customer;
import com.example.jpa.entity.Item;

@SpringBootTest
public class CustomerRepositoryTest {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	public void saveCustomer() {
		Customer cust= new Customer();
		cust.setCustomer_name("sachin");
		cust.setCustomer_age(37);
		
		Item item= new Item();
		item.setItem_name("Racket");
		
		cust.setItem(item);
		
		customerRepository.save(cust);
		
		
	}
}
