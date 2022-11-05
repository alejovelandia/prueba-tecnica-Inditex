package com.inditex.prueba.tecnica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "PRODUCTS")
@Entity
@Data
public class Product {
	
	 @Id
	 private Long id;
	
	@Column(name="NAME", length=64, nullable=false, unique=false)
	 private String name;

}
