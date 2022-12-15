package com.example.demoSpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpringBoot.Bean.Passport;
import com.example.demoSpringBoot.Service.Passport_Service;

@RestController
public class Passport_Controller {

	@Autowired
	Passport_Service ps;
	
	@GetMapping("getList")
	public List<Passport>getList(){
		return ps.getList();
	}
	@GetMapping("getList/{id}")
	public Passport getById(@PathVariable int id) {
		return ps.getById(id);
	}
	@GetMapping("/getList/Name")
	public ResponseEntity<Passport> getByName(@RequestParam(value = "name") String Name) {
		Passport pass=ps.getByName(Name);
		return new ResponseEntity<Passport>(pass,HttpStatus.OK);
		
	}
	@PostMapping("/addList")
	public Passport create(@RequestBody Passport pass) {
		return ps.addList(pass);
	}
	
	@PutMapping("/updateList")
	public Passport update(@RequestBody Passport pass) {
		return ps.update(pass);
	}
	@DeleteMapping("/deleteList/{id}")
	public String delete(@PathVariable int id) {
		ps.delete(id);
		return "Sucessfully Deleted with ID "+id;
	}
}
