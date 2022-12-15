package com.spring.Ass2.bean;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int Cust_Id;
	@NotEmpty(message = "Name Shouldn't Empty")
	String Cust_name;
	@NotEmpty(message = "Location Shouldn't Empty")
	String Location;
	@Email
	String Email;
	@Size(min = 10, max = 13, message = "Invalid Phone number")
	String Phone_Number;
	@Min(value = 10000, message = "sales Amount should be min $10000")
	@NumberFormat(style = Style.CURRENCY)
	double SalesAmount;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cust_Id, String cust_name, String location, String email, String phone_Number,
			double salesAmount) {
		super();
		Cust_Id = cust_Id;
		Cust_name = cust_name;
		Location = location;
		Email = email;
		Phone_Number = phone_Number;
		SalesAmount = salesAmount;
	}

	public int getCust_Id() {
		return Cust_Id;
	}

	public void setCust_Id(int cust_Id) {
		Cust_Id = cust_Id;
	}

	public String getCust_name() {
		return Cust_name;
	}

	public void setCust_name(String cust_name) {
		Cust_name = cust_name;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone_Number() {
		return Phone_Number;
	}

	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}

	public double getSalesAmount() {
		return SalesAmount;
	}

	public void setSalesAmount(double salesAmount) {
		SalesAmount = salesAmount;
	}

}