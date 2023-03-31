package com.example.jpa.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.jpa.entity.Address;
import com.example.jpa.entity.Manager;

@SpringBootTest
public class AddressRepositoryTest {

	@Autowired
	private AddressRepository addressRepository;
	
	@Test
	public void saveAddress() {
		Address address= new Address();
		address.setArea("Aurangabad");
		address.setHouseNumber("#555");
		address.setStreetName("mandir road");
		address.setPinCode(555100L);
		
		Address address1= new Address();
		address1.setArea("Kormangala");
		address1.setHouseNumber("B-75");
		address1.setStreetName("water tank road");
		address1.setPinCode(560099L);
		
	
		List<Address> addressList = new ArrayList<>();
		addressList.add(address);
		addressList.add(address1);
	
		Manager manager = new Manager();
		manager.setFirstName("vaishali");
		manager.setLastName("sanknoor");
		manager.setAddress(addressList);
		
		address.setManager(manager);
		address1.setManager(manager);
		
		
		addressRepository.save(address);
	
		
		
	}
	
	@Test
	public void getAddress() {
		
		
		
	}
}
