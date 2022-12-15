package com.spring.Profiles2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Profiles2.bean.Employee;
import com.spring.Profiles2.jpa.Employee_Jpa;

@Service
public class Employee_Services {
	
@Autowired
	Employee_Jpa repo;
	

public List<Employee>getAll(){
	return repo.findAll();
}
public void add(Employee emp) {
	repo.save(emp);
}

public Employee update(Employee emp) {
	return repo.save(emp);
}

public Employee getEmpById(int id) {
	return repo.findById(id).get();
}

public void delete(int id) {
	repo.deleteById(id);
}

}
