package com.inditex.prueba.tecnica.model;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class PriceRequestDto {
	
	private OffsetDateTime applicationDate;
	
	private Long productId;
	
	private Long brandId;

}
