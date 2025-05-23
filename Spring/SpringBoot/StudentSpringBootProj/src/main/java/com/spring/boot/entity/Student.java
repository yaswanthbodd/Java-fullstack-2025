package com.spring.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Student {
	private int studentId;
	private String studentName;
	private String studentCollege;
	private int studentCGPA;
}
