package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
@Service
public class EmployeeService {
	
	
	
	@Autowired(required=true)
	EmployeeJPA empl;
	
	public List<Employee>getAll(){
		return empl.findAll();
	}
	public Employee getbyId(int id) {
		return empl.findById(id).get();
	}
	
	public Employee add(Employee emp) {
		empl.save(emp);
		return emp;
	}
	 public Employee update(Employee emp) {
		 empl.save(emp);
		 return emp;
	 }
	 public void delete(int id) {
		 empl.deleteById(id);
	 }
}
