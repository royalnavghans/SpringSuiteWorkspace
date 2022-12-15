package com.spring.Profiles.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.spring.Profiles.bean.Customer;
@Component
@Profile("test")
public class CustomerImpl implements Customer {
	

	
	
	@Override
	public void getCustomer(String name) {
		// TODO Auto-generated method stub
System.out.println("Hello My name is "+name);
	}

}
