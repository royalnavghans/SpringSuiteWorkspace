package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "SpringEmp")
public class Employee {

@Id
@Column(name = "id")
int EMP_ID;
@Column(name = "fname")
String FISRT_NAME;
@Column(name = "lname")
String LAST_NAME;
@Column(name = "email")
String EMAIL;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int eMP_ID, String fISRT_NAME, String lAST_NAME, String eMAIL) {
	super();
	EMP_ID = eMP_ID;
	FISRT_NAME = fISRT_NAME;
	LAST_NAME = lAST_NAME;
	EMAIL = eMAIL;
}
public int getEMP_ID() {
	return EMP_ID;
}
public void setEMP_ID(int eMP_ID) {
	EMP_ID = eMP_ID;
}
public String getFISRT_NAME() {
	return FISRT_NAME;
}
public void setFISRT_NAME(String fISRT_NAME) {
	FISRT_NAME = fISRT_NAME;
}
public String getLAST_NAME() {
	return LAST_NAME;
}
public void setLAST_NAME(String lAST_NAME) {
	LAST_NAME = lAST_NAME;
}
public String getEMAIL() {
	return EMAIL;
}
public void setEMAIL(String eMAIL) {
	EMAIL = eMAIL;
}


}
