package com.inditex.prueba.tecnica.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inditex.prueba.tecnica.mapper.PriceMapper;
import com.inditex.prueba.tecnica.model.PriceRequestDto;
import com.inditex.prueba.tecnica.model.PriceResponseDto;
import com.inditex.prueba.tecnica.repository.PriceRepository;
import com.inditex.prueba.tecnica.service.IPriceService;

@Service
public class PriceService implements IPriceService {

	@Autowired
	PriceRepository priceRepository;
	
	@Autowired
	PriceMapper priceMapper;
	
	@Override
	public Optional<PriceResponseDto> getPrice(PriceRequestDto priceRequestDto) {
		// TODO Auto-generated method stub
		
		return priceRepository.findByProductIdAndBrandIdAndApplicationDate(
			priceRequestDto.getProductId(),
			priceRequestDto.getBrandId(),
			priceRequestDto.getApplicationDate())
				.stream()
				.findFirst()
			.map(price -> priceMapper.entityToDto(price));
		
		
			
	}

}
