package com.example.jpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseMaterial {
	
	@Id
	@SequenceGenerator(name = "coursematerial_sequence", sequenceName = "coursematerial_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "coursematerial_sequence")
	private Long courseMaterialId;
	private String url;
	@OneToOne(cascade = CascadeType.ALL,optional = false)
	@JoinColumn(name="course_id", referencedColumnName = "courseId")
	private Course course;
	
	

}
