package com.example.security.service;

import java.util.Objects;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.security.entity.User;
import com.example.security.repository.UserRepository;
@Service
public class CustomUserDetailsService implements UserDetailsService {

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
