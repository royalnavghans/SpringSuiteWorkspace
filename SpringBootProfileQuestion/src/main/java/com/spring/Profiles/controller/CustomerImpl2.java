package com.spring.Profiles.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.spring.Profiles.bean.Customer;
@Component
@Profile("dev")
public class CustomerImpl2 implements Customer {
	
	
	
	@Override
	public void getCustomer(String name) {
		// TODO Auto-generated method stub
     System.out.println("im from "+name);
	}

}
