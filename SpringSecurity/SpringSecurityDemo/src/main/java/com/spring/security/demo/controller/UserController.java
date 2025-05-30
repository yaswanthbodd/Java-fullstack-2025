package com.spring.security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.demo.model.Users;
import com.spring.security.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	@PostMapping("/register")
	public Users register(@RequestBody Users user) {
		return service.register(user);
	}
}
