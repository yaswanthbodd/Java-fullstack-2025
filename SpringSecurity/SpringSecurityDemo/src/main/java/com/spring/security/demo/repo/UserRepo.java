package com.spring.security.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.security.demo.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer>{
	
	Users findByUsername(String username);
}
