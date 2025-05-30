package com.spring.security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.security.demo.model.Users;
import com.spring.security.demo.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	//Encrypt the password using bcrypt
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	public Users register(Users user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
	}
}
