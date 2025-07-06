package com.example.security.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.entity.User;
import com.example.security.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public String home() {
		return "Welcome to home";
	}
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody User user) {
		var u =userRepository.findByUserName(user.getUserName());
		if(!Objects.isNull(u))
			return "Success";
		return "Failure";
	}
}
