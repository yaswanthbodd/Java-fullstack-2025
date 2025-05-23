package com.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Student;

@Service
public class StudentService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void addStudent(Student stud) {
		String SQL = "insert into student values(?,?,?,?)";
		jdbcTemplate.update(SQL,new Object [] {stud.getStudentId(),stud.getStudentName(), stud.getStudentCollege(),stud.getStudentCGPA()});
	}
}
