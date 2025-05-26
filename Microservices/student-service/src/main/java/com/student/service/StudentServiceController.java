package com.student.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServiceController {
	private static Map<String, List<Student>> schoolDB;	
	static {
		schoolDB =  new HashMap<String, List<Student>>();
		List<Student> studList = new ArrayList<>();
		Student stud = new Student("Yaswanth","CSE");
		studList.add(stud);
		stud = new Student("Kesav", "IT");
		studList.add(stud);
		schoolDB.put("lbrce", studList);
		studList = new ArrayList<>();
		stud = new Student("Subbu","ECE");
		studList.add(stud);
		stud = new Student("Yaswanth","CSE");
		studList.add(stud);
		schoolDB.put("stanns", studList);
	}
	
	@RequestMapping("/getStudentDetailsForSchool/{schoolname}")
	public List<Student> getStudents(@PathVariable String schoolname){
		List<Student> studList = schoolDB.get(schoolname);
		return studList;
	}

}

/*
 * 
 * API to access student-service
 * http://localhost:1111/getStudentDetailsForSchool/LBRCE
 * http://localhost:1111/getStudentDetailsForSchool/STANNS
 * 
 * 
 */
