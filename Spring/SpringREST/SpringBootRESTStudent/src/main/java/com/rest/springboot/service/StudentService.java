package com.rest.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.springboot.entities.Student;
import com.rest.springboot.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Student getStudentById(Integer studentId) {
		return studentRepository.findById(studentId).get();
	}
	
	public List<Student> getStudentLists(){
		return studentRepository.findAll();
	}
	
	public void deleteStudent(Integer studentId) {
		studentRepository.deleteById(studentId);
	}
	
	public Student updateStudent(Integer studentId,Integer studentCgpa) {
		Student studentFromDb = studentRepository.findById(studentId).get();
		studentFromDb.setStudentCgpa(studentCgpa);
		Student updatedStudent = studentRepository.save(studentFromDb);
		return updatedStudent;
	}
}
