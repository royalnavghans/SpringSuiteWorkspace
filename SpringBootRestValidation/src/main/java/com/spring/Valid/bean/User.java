package com.spring.Valid.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@NotNull
	@Size(min = 5, message = "User name should have least 5 chars")
	String Name;
	@NotNull
	@Email
	String Email;
	@NotNull
	@Size(min = 5, max = 20, message = "Should not be less than 5 char and  not greater than 20 chars")
	String Password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public User(int id, String name, String email, String password) {
		super();
		this.id = id;
		Name = name;
		Email = email;
		Password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}
