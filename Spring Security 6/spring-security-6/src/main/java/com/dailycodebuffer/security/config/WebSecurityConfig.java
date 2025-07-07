package com.dailycodebuffer.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {	
	
	private final UserDetailsService userDetailsService;
	
	public WebSecurityConfig(UserDetailsService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity
			.csrf(csrf -> csrf.disable())
			.authorizeHttpRequests(
				request -> request
								.requestMatchers("register","login").permitAll()
								.anyRequest().authenticated()	
			)
			.httpBasic(Customizer.withDefaults());
		
		return httpSecurity.build();
	}
	
	//@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user1 = User.withUsername("yaswanth")
				               	.password("{noop}yaswanth")
				               	.roles("USER")
				               	.build();
		
		UserDetails user2 = User.withUsername("chinni")
				 				.password("{noop}chinni")
				 				.roles("USER")
				 				.build();
		
		return new InMemoryUserDetailsManager(user1, user2);	
	}
	
	//Password Encoder
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder(14);
	}
	
	//Authentication
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		//provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		provider.setPasswordEncoder(bCryptPasswordEncoder());
		return provider;
	}
}
