package com.example.jpa.repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.jpa.entity.Activities;
import com.example.jpa.entity.Department;
import com.example.jpa.entity.Student;

@SpringBootTest
public class StudentRepositoryTest {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void saveStudent() {
		
	  Department dept= new Department();
	  dept.setDepartmentName("Computer Science Department");
	  
	  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date1 = new Date("16/01/2022 11:30:00");  
	    
	    Date date2 = new Date("16/01/2022 05:30:00");  
	
	  Activities activities = new Activities();
	  activities.setActivityName("singing");
	  activities.setPeriod(date1);
	  
	  Activities activities2 = new Activities();
	  activities2.setActivityName("debate");
	  activities2.setPeriod(date2);
	  
	  
	  List<Activities> activityList = new ArrayList<>();
	  
	  activityList.add(activities);
	  activityList.add(activities2);
	  

		Student student = Student.builder().firstName("Rahul").lastName("kapoor")
				.emailId("kapoor@gmail.com").gurdianName("Jeetu").gurdianEmail("jeetu@gmail.com")
				.gurdianMobile("8964735")
				.department(dept)
				.activites(activityList).build();

		studentRepository.save(student);

		
	

	}

	@Test
	public void getStudents() {
		List<Student> students = studentRepository.findAll();
		System.out.println(students);

	}
	
	@Test
	public void getStudentByFirstname() {
		List<Student> students=studentRepository.findByFirstName("satish");
		System.out.println(students);
		
	}
	
	@Test
	public void getStudentByEmailAddress() {
		Student s = studentRepository.getStudentByEmailAddress("sachin.sanknoor@gmail.com");
		
		System.out.println(s);
	}
	
	@Test
	public void updateStudentRecord() {
		int record=studentRepository.updateStudentBasedOnEmail("Rahul", "sachin.sanknoor@gmail.com");
		System.out.println(record);
		
	}
}
