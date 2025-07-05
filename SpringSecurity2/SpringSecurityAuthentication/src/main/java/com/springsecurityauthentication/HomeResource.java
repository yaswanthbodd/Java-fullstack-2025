package com.springsecurityauthentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	@GetMapping("/")
	public String home() {
		return "Welcome";
	}
	
	  @GetMapping("/dashboard")
	    public String dashboard() {
	        return "Default Dashboard";
	    }
	  @GetMapping("/public/home")
	    public String publicHome() {
	        return "Public Home Page";
	    }
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>Welcome to USER</h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welocme to Admin</h1>");
	}
}
