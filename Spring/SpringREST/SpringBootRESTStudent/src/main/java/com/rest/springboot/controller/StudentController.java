package com.rest.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.springboot.entities.Student;
import com.rest.springboot.service.StudentService;

@RestController
@RequestMapping(value = "/api/students")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping(value = "/create") // http://localhost:8082/api/students/create
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@GetMapping( value = "/student/{studentId}") // http://localhost:8082/api/students/student/1
	public Student getStudentById(@PathVariable("studentId")Integer studentId) {
		return studentService.getStudentById(studentId);
	}
	
	@GetMapping(value = "/student/allStudents") // http://localhost:8082/api/students/student/allStudents
	public List<Student> getStudentLists(){
		return studentService.getStudentLists();
	}
	
	@DeleteMapping(value = "/student/{studentId}") // http://localhost:8082/api/students/student/1
	public void deleteStudent(@PathVariable("studentId")Integer studentId) {
		studentService.deleteStudent(studentId);
	}
	
	@PutMapping(value = "/student/{studentId}/{newCgpa:.+}") // http://localhost:8082/api/students/student/1/9
	public Student updateStudent(@PathVariable("studentId")Integer studentId,@PathVariable("newCgpa")Integer newCgpa) {
		return studentService.updateStudent(studentId, newCgpa);
	}
}
