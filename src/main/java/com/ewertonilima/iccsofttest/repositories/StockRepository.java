package com.ewertonilima.iccsofttest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewertonilima.iccsofttest.entities.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{
	
	public Stock findAllByNameContainingIgnoreCase(String name);
}
