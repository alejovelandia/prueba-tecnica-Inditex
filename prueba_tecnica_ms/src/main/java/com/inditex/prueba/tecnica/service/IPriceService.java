package com.inditex.prueba.tecnica.service;

import java.util.Optional;

import com.inditex.prueba.tecnica.model.PriceRequestDto;
import com.inditex.prueba.tecnica.model.PriceResponseDto;

public interface IPriceService {
	
	/**
	* Find first price by product id, brand id and application date
	* ordered by priority descending
	*
	* @param priceRequestDto object that wraps product id,
	* 						 brand id and application date
	* @return Optional of PriceResponseDto, object if there 
	* 		  is at least one coincidence, or empty
	*/
	Optional<PriceResponseDto> getPrice(PriceRequestDto priceRequestDto);

}
