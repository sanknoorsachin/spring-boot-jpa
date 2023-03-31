package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.entity.Course;
import com.example.jpa.entity.CourseMaterial;

public interface CourseMaterialRepository  extends JpaRepository<CourseMaterial, Long>{

}
