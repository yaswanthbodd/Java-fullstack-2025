package com.rest.springboot.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "student")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
	@Id
	@Column(name = "studentId")
	private Integer studentId;
	
	@Column(name = "studentName", nullable = false)
	private String studentName;
	
	@Column(name = "studentCollege")
	private String studentCollege;
	
	@Column(name = "studentCgpa")
	private Integer studentCgpa;
}
