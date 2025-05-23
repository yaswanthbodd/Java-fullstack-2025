package com.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.boot.entity.Student;
import com.spring.boot.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@RequestMapping("/addStudent")
	public ModelAndView addStudent(@RequestParam("studentId") int studentId,@RequestParam("studentName") String studentName,
			@RequestParam("studentCollege") String studentCollege, @RequestParam("studentCGPA") int studentCGPA) {
		Student stud = new Student();
		stud.setStudentId(studentId);
		stud.setStudentName(studentName);
		stud.setStudentCollege(studentCollege);
		stud.setStudentCGPA(studentCGPA);
		studentService.addStudent(stud);
		return new ModelAndView("successStudent.jsp");
	}

}
