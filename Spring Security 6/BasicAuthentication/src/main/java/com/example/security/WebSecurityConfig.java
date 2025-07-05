package com.example.security;

import java.net.http.HttpRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authorizeHttpRequests(
					request -> request
					.requestMatchers("/register").permitAll()
					.anyRequest().authenticated()
			)
			.formLogin(Customizer.withDefaults());
			
		return http.build(); 
	}
	
	// User Details
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user1 = User.withUsername("yash")
								.password("{noop}yash")
								.roles("USER")
								.build();
		UserDetails user2 = User.withUsername("sai")
								.password("{noop}sai")
								.roles("USER")
								.build();
		return new InMemoryUserDetailsManager(user1, user2);
	}
}
