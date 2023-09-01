package com.senai.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.curse.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
