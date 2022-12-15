package com.spring.Query.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.Query.jpa.Supplier_Jpa;
@Component
public class Supplier_Controllers implements CommandLineRunner {
	@Autowired
	Supplier_Jpa repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
System.out.println("//==========================findBySuppIdandName==============================//");
		System.out.println(repo.findBySuppIdandName(1, "srihari"));
		System.out.println("//==========================findBySuppIdorName==============================//");
		  System.out.println(repo.findBySuppIdorName(3, "vishnu")); 
		  System.out.println("//==========================findsupplocation==============================//");
		repo.findsupplocation("coimbatore").forEach(System.out::println);
		  
		  
		System.out.println("//==========================fetchAggregateData==============================//");
		  
		  Object[]obj=(Object[])repo.fetchAggregateData(); 
		  System.out.println("Max price "+obj[0]); 
		  System.out.println("Min price "+obj[1]); 
		  System.out.println("Avg price "+obj[2]); 
		  System.out.println("Total rows "+obj[3]); 
		  System.out.println("Sum of Cost"+obj[4]); 
		 		
	}

}
