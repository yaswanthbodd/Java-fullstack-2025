package com.example.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResources {
	
	@RequestMapping("/")
	public String home() {
		return ("<h1>Welcome to Home</h1>");
	}
}
