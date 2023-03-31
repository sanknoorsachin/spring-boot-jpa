package com.example.jpa.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.jpa.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	List<Student> findByFirstName(String name);
	
	@Query("select s from Student s where s.emailId =:emailId")
	Student getStudentByEmailAddress(@Param("emailId") String emailId);
	
	
	@Transactional
	@Modifying
	@Query("update Student s set s.firstName=:firstName where s.emailId=:emailId")
	int updateStudentBasedOnEmail(@Param("firstName") String firstName,@Param("emailId") String emailId); 
		
	
	
}
