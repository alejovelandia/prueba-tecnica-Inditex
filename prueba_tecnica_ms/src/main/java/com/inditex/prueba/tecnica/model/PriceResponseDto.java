package com.inditex.prueba.tecnica.model;

import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class PriceResponseDto {
	
	private Long productId;
	private Long brandId;
	private Long priceId;
	private OffsetDateTime startDate;
	private OffsetDateTime endDate;
	private Double price;

}
