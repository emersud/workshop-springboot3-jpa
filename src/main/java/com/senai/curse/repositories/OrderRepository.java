package com.senai.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.curse.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
