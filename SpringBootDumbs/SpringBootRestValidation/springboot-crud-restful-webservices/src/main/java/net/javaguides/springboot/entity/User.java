package net.javaguides.springboot.entity;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity

@Table(name = "userss")

public class User {
	
	
@Id
	
@GeneratedValue(strategy = GenerationType.AUTO)
	
private long id;
	
	
@NotNull
	
@Size(min=2,message="First Name should have at least 2 chars")
	@Column(name = "first_name")
	
private String firstName;
	
	
@NotNull
	
@Size(min=2,message="Last Name should have at least 2 chars")
	@Column(name = "last_name")
	
private String lastName;
	
	
@NotNull
	
@Email
	
@Column(name = "email")
	
private String email;
	
	
public User() {
		
	
}
	
	
public User(String firstName, String lastName, String email) {
		super();
		
this.firstName = firstName;
		
this.lastName = lastName;
		
this.email = email;
	
}
	
	
public long getId() {
		
return id;
	
}
	
public void setId(long id) {
		
this.id = id;
	
}
	
public String getFirstName() {
		
return firstName;
	
}
	
public void setFirstName(String firstName) {
		this.firstName = firstName;
	
}
	
public String getLastName() {
		
return lastName;
	
}
	
public void setLastName(String lastName) {
		this.lastName = lastName;
	
}
	
public String getEmail() {
		
return email;
	
}
	
public void setEmail(String email) {
		
this.email = email;
	
}

}
