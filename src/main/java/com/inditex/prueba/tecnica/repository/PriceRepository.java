package com.inditex.prueba.tecnica.repository;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inditex.prueba.tecnica.entity.Price;

@Repository
public interface PriceRepository extends CrudRepository<Price, Long>{

	@Query("select price from Price price "
			+ "where price.product.id = :productId "
			+ "and price.brand.id = :brandId "
			+ "and :applicationDate >= price.startDate "
			+ "and :applicationDate <= price.endDate "
			+ "and :applicationDate BETWEEN price.startDate AND price.endDate "
			+ "order by price.priority desc")
	List<Price> findByProductIdAndBrandIdAndApplicationDate(Long productId, 
			Long brandId, OffsetDateTime applicationDate);
}
