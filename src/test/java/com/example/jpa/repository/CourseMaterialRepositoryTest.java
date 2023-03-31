package com.example.jpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.example.jpa.entity.Course;
import com.example.jpa.entity.CourseMaterial;

@SpringBootTest
public class CourseMaterialRepositoryTest {
	
	@Autowired
	private CourseMaterialRepository courseMaterialRepository;
	
	@Test
	public void saveCourse() {
		
		Course course= Course.builder()
				.title(".net")
				.credit("2")
				.build();
		
		CourseMaterial couserMaterial = CourseMaterial.builder()
				.url("http://net.com")
				.course(course)
				.build();
		
		courseMaterialRepository.save(couserMaterial);
		
		
	}
	
	@Test
	public void printCourseMaterial() {
		List<CourseMaterial> data = courseMaterialRepository.findAll();
		System.out.println(data);
		
	}

	
}
