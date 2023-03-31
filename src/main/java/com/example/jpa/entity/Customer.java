package com.example.jpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {@Id
	@SequenceGenerator(name = "cust_sequence", sequenceName = "cust_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cust_sequence")
	
	private Long cust_id;

	private String customer_name;
	private Integer customer_age;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_item", joinColumns = { @JoinColumn(name = "cust_id") }, inverseJoinColumns = {
			@JoinColumn(name = "item_id") })
	private Item item;

}
