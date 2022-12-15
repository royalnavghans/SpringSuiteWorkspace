package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	@GetMapping
	public String getUsers(@RequestParam(value="page") int pageno,@RequestParam(value="limit") int limitno)
	{
		return "http Get request sent for page: "+ pageno+" and limit is:"+limitno;
	}
	
	
	/*
	@GetMapping
	public String getUsers()
	{
		return "http Get request sent";
	}
	*/
	
	
	@GetMapping(path= "/{userID}")
	public String getUser(@PathVariable String userID) //Path Parameter
	{
		return "http Get request sent for userid: " + userID;
	}
	
	@PostMapping
	public String createUser()
	{
		return "http Post request sent";
	}
	
	@DeleteMapping
	public String deleteUser()
	{
		return "http Delete request sent";
	}
	
	@PutMapping
	public String updateUser()
	{
		return "http Put request sent";
	}
	
}
