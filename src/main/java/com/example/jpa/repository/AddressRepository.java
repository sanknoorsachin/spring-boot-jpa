package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
