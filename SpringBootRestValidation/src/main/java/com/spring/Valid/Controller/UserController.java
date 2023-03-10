package com.spring.Valid.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Valid.Repository.UserJpa;
import com.spring.Valid.bean.User;

import jakarta.validation.Valid;

@RestController

public class UserController {
@Autowired
	UserJpa user;
	
@GetMapping("/user")
public List<User>getAll(){
	return user.findAll();
}


@PostMapping("/user")
public User add(@Valid @RequestBody User use) {
	return this.user.save(use);
}


}
