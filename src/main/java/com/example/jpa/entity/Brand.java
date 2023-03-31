package com.example.jpa.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"category"})
public class Brand {
	@Id
	@SequenceGenerator(name = "brand_sequence", sequenceName = "brand_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_sequence")
	private Long brand_id;
	private String brand_name;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy ="brand" )
	private Set<Category> category= new HashSet<>();
    
	

}
