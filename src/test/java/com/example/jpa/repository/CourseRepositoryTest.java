package com.example.jpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.example.jpa.entity.Course;
import com.example.jpa.entity.CourseMaterial;
@SpringBootTest
public class CourseRepositoryTest {

	@Autowired
	private CourseRepository courseRepository;
	
	@Test
	public void saveCourses() {
		Course course= Course.builder()
				.credit("7")
				.title("Master PHP")
				.build();
		
		CourseMaterial courseMaterial = CourseMaterial.builder()
				.url("http://learningphp.com")
				.build();
		Course.builder().courseMaterial(courseMaterial);
		CourseMaterial.builder().course(course);
		
		courseRepository.save(course);
		
		
				
	}
	
	@Test
	public void printCourse() {
		List<Course> course= courseRepository.findAll();
		System.out.println(course);
	}
	
	@Test
	public void findAllPagination() {
		
		Pageable paging = PageRequest.of(3, 4);
		
		List<Course> courses= courseRepository.findAll(paging).getContent();
		
		System.out.println(courses);
		
		
	}
	
}
