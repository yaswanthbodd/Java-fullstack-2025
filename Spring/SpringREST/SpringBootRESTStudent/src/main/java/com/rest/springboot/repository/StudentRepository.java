package com.rest.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.springboot.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
