package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
   @Autowired
	EmployeeService empls;
   
   
	@GetMapping("/getEmp")
	public List<Employee> getEmp(){
		return empls.getAll();
	}
	@GetMapping("/getEmp/{id}")
	public ResponseEntity<Employee>getbyId(@PathVariable(value = "id") int id){
	try {
		Employee emplo=empls.getbyId(id);
		return new ResponseEntity<Employee>(emplo,HttpStatus.OK);
	}
	catch(Exception e) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	}
	@PostMapping("/addEmp")
	public Employee add(@RequestBody Employee emp) {
		return empls.add(emp);
	}
}
