package com.senai.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.curse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
