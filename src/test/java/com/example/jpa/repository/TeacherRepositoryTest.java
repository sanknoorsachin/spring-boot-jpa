package com.example.jpa.repository;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.jpa.entity.Course;
import com.example.jpa.entity.CourseMaterial;
import com.example.jpa.entity.Teacher;

@SpringBootTest
public class TeacherRepositoryTest {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Test
	public void  saveTeacherRecord() {
		
	
		
		
		Course course = new Course();
		course.setCredit("12");
		course.setTitle("Basics of Aws");
		
		CourseMaterial courseMaterial = new  CourseMaterial();
		courseMaterial.setUrl("http://aws.com");
		
		course.setCourseMaterial(courseMaterial);
		
		courseMaterial.setCourse(course);
			
		
		
		List<Course> courseList= new ArrayList<Course>();
		courseList.add(course);
		
		
		Teacher teacher= Teacher.builder()
				.firstName("aero")
				.lastName("smith")
			     .courses(courseList)
			     .build();
		
		teacherRepository.save(teacher);
		
		
	}

}
