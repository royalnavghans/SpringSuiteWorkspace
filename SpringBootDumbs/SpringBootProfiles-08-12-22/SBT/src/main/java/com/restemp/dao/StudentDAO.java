package com.restemp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restemp.entity.Student;



public interface StudentDAO extends JpaRepository<Student, Integer>{
	
	

}
