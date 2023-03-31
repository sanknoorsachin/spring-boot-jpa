package com.example.jpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.jpa.entity.Address;
import com.example.jpa.entity.Manager;


@SpringBootTest
public class ManagerRepositoryTest {

	@Autowired
	private ManagerRepository managerRepository;
	
	@Test
	public void getManager() {
		
		Manager managerRecord= managerRepository.findManagerById(7L);
		
		System.out.println("Manager firstname:::"+managerRecord.getFirstName());
		System.out.println("Manager lastname:::"+managerRecord.getLastName());
		
		managerRecord.getAddress().stream().forEach(a->{
			System.out.println("Area:::"+a.getArea());
			System.out.println("street:::"+a.getStreetName());
			System.out.println("house number:::"+a.getHouseNumber());
			System.out.println("pin code:::"+a.getPinCode());
		});
	}
}
