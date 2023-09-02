package com.senai.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.curse.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	

}
