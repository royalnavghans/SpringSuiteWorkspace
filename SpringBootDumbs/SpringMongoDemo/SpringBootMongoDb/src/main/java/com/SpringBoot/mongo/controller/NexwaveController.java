package com.SpringBoot.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.mongo.bean.NexwaveEmployee;
import com.SpringBoot.mongo.service.NexwaveService;

@RestController
public class NexwaveController {
@Autowired
	NexwaveService nex;
	

@GetMapping("/getInfo")
public List<NexwaveEmployee>getInfo(){
	return nex.getAllInfo();
}
@PostMapping("/addInfo")
public String add(@RequestBody NexwaveEmployee emp) {
	nex.addInfo(emp);
	
	return"Added data Successfully to Database";
}
@PutMapping("/updateInfo")
public NexwaveEmployee update(@RequestBody NexwaveEmployee emp) {
	return nex.update(emp);
}
@DeleteMapping("/deleteInfo/{id}")
public String delete(@PathVariable int id) {
	nex.delete(id);
	return "Deleted Successfully from the database";
}

}
