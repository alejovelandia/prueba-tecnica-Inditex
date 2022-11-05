package com.inditex.prueba.tecnica.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inditex.prueba.tecnica.model.PriceRequestDto;
import com.inditex.prueba.tecnica.model.PriceResponseDto;
import com.inditex.prueba.tecnica.service.impl.PriceService;

@RestController
public class PriceController {
	
	@Autowired
	PriceService priceService;
	
	@GetMapping("/prices")
	public ResponseEntity<PriceResponseDto> getPrice(@RequestBody PriceRequestDto priceRequestDto) {
		
		 return ResponseEntity.of(priceService.getPrice(priceRequestDto));
		
	}

}
