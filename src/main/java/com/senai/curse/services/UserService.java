package com.senai.curse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.curse.entities.User;
import com.senai.curse.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}

}