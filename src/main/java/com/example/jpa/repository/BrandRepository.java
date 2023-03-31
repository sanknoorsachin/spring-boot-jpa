package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {

}
