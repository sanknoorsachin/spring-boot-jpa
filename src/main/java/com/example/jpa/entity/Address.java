package com.example.jpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
	@SequenceGenerator(name = "add_sequence", sequenceName = "add_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "add_sequence")
	private Long addressId;
	private String streetName;
	private String houseNumber;
	private String area;
	private Long pinCode;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="manager_id")
	private Manager manager;
	

}
