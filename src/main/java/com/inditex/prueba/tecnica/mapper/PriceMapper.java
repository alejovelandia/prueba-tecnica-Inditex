package com.inditex.prueba.tecnica.mapper;

import org.springframework.stereotype.Component;

import com.inditex.prueba.tecnica.entity.Price;
import com.inditex.prueba.tecnica.model.PriceResponseDto;

@Component
public class PriceMapper {
	
	public PriceResponseDto entityToDto(Price price) {
		PriceResponseDto response = new PriceResponseDto();
		
		response.setBrandId(price.getBrand().getId());
		response.setProductId(price.getProduct().getId());
		response.setStartDate(price.getStartDate());
		response.setEndDate(price.getEndDate());
		response.setPriceId(price.getId());
		response.setPrice(price.getPrice());
		
		return response;
	}

}
