package com.spring.Profiles2.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.Profiles2.repo.ProductRepo;
@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	ProductRepo repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	
//		System.out.println(repo.getAllName());
//		
//		Object[] obj=(Object[])repo.findMax();
//		
//		System.out.println(obj[0]);
//		System.out.println(obj[1]);
		
	repo.findByPrice(980).forEach(System.out::println);
//	repo.findByName("nokia").forEach(System.out::println);
//	repo.findMinMax(980,1200).forEach(System.out::println);
	
	}
	
	
	

}