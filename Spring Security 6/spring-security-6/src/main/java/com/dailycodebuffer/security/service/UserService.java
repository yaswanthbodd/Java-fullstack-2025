package com.dailycodebuffer.security.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.security.entity.User;
import com.dailycodebuffer.security.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtService jwtService;

	public User register(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

	public String verify(User user) {
		
		Authentication authentication = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword())
				);
		
		if(authentication.isAuthenticated())
			return jwtService.generateToken(user);
		return "Failure";
		
		//var u = userRepository.findByUserName(user.getUserName());
//		if(!Objects.isNull(u))
//			return "892803920392093203920";
//		return "Failure";
	}
}
