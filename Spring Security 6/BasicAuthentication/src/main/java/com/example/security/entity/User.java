package com.example.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
		
	@Id
	public Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String userName;
	public String password;
	
}
