package com.spring.Profiles2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Profiles2.bean.Employee;
import com.spring.Profiles2.service.Employee_Services;

@RestController
public class Employee_Controller {
	@Autowired
	Employee_Services emp;

	@PostMapping("/addEmp")
	public String addEmp(@RequestBody Employee empp) {
		emp.add(empp);

		return "Added Successfully";
	}

	@GetMapping("/getEmp")
	public List<Employee> getEmpAll() {
		return emp.getAll();
	}

	@PutMapping("/updateEmp")
	public Employee updates(@RequestBody Employee emps) {
		return emp.update(emps);
	}

	@GetMapping("/getEmpById/{id}")
	public Employee getById(@PathVariable int id) {
		return emp.getEmpById(id);
	}

	@DeleteMapping("/deleteEmp/{id}")
	public String delete(@PathVariable int id) {
		emp.delete(id);
		return "Deleted Sucessfully";
	}

}
