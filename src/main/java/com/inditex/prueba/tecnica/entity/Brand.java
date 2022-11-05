package com.inditex.prueba.tecnica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "BRANDS")
@Entity
@Data
public class Brand {
	
	@Id
	@Column(name="ID")
	 private Long id;
	
	@Column(name="NAME", length=64, nullable=false, unique=false)
	 private String name;

}
