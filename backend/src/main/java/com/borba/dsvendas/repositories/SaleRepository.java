package com.borba.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.borba.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
