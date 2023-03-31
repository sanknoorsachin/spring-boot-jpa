package com.example.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {

	@Id
	@SequenceGenerator(name = "doc_sequence", sequenceName = "doc_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doc_sequence")
	private Long docId;
	private String docNumber;
	private String accessLevel;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "document_product", joinColumns = { @JoinColumn(name = "doc_id") }, inverseJoinColumns = {
			@JoinColumn(name = "prod_id") })
	private List<Product> products;

}
