package com.borba.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.borba.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
	
}
