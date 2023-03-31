package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.jpa.entity.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
	
	@Query("select m from Manager m Join Fetch m.address where m.managerId=:id")
	Manager findManagerById(@Param(value = "id") Long id);

}
