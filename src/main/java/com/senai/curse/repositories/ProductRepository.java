package com.senai.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.curse.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
