package com.inditex.prueba.tecnica.entity;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "PRICES")
@Entity
@Data
public class Price {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	
	 @ManyToOne
	 @JoinColumn(name="BRAND_ID", nullable=false)
	 private Brand brand;
	 
	 @Column(name="START_DATE", nullable=false, unique=false)
	 private OffsetDateTime startDate;
	 
	 @Column(name="END_DATE", nullable=false, unique=false)
	 private OffsetDateTime endDate;
	 
	 @ManyToOne
	 @JoinColumn(name="PRODUCT_ID", nullable=false)
	 private Product product;
	 
	 @Column(name="PRIORITY", nullable=false, unique=false)
	 private Integer priority;
	 
	 @Column(name="PRICE", precision=10, scale=2, nullable=false, unique=false)
	 private Double price;
	 
	 @Column(name="CURR", length=3, nullable=false, unique=false)
	 private String curr;

}
