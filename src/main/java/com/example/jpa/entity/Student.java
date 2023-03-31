package com.example.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_student", uniqueConstraints = @UniqueConstraint(columnNames = {
		"email_address" }, name = "email_unique"))

public class Student {

	@Id
	@SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
	private Long studentId;

	private String firstName;
	private String lastName;

	@Column(name = "email_address", nullable = false)
	private String emailId;

	private String gurdianName;
	private String gurdianEmail;
	private String gurdianMobile;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="department_Id", referencedColumnName = "departmentId")
	private Department department;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="student_id", referencedColumnName = "studentId") 
	private List<Activities> activites;
	 
}
