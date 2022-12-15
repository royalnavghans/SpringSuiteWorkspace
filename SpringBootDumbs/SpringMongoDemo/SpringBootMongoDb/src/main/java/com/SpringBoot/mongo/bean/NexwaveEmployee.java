package com.SpringBoot.mongo.bean;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Document(collection = "FullStackJava")
public class NexwaveEmployee {

	@Id
	private String name;
	private String position;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public NexwaveEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NexwaveEmployee(String name, String position, double salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "NexwaveEmployee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}
	

}
