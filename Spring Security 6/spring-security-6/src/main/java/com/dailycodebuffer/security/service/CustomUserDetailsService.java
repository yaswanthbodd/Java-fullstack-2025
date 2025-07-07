package com.dailycodebuffer.security.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.dailycodebuffer.security.CustomUserDetails;
import com.dailycodebuffer.security.entity.User;
import com.dailycodebuffer.security.repository.UserRepository;

@Component
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUserName(username);
		if(Objects.isNull(user)) {
			System.out.println("User not available");
			throw new UsernameNotFoundException("User not found");
		}
		return new CustomUserDetails(user);
	}

}
