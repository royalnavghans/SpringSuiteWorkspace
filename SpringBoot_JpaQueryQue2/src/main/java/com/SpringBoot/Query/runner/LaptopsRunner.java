package com.SpringBoot.Query.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBoot.Query.Jpa.LaptopJpa;
@Component
public class LaptopsRunner implements CommandLineRunner {
	@Autowired
LaptopJpa repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		repo.FetchlaptopByPriceRange(50000,100000).forEach(System.out::println);
		repo.FetchlaptopByName("M2").forEach(System.out::println);
		repo.FetchNameByBrand("M3").forEach(System.out::println);
		System.out.println(repo.FetchPriceByBrand("dell"));
		System.out.println(repo.FetchDescriptionbyPriceandBrand(42000.00,"HP"));
		System.out.println(repo.SearchBrandbyName("vivoBook"));
		System.out.println(repo.FetchMaxPrice());
		System.out.println(repo.FetchMinPrice());
		System.out.println(repo.FetchAvgPrice());
		System.out.println(repo.FetchTotalPrice());
		System.out.println(repo.FetchCount());
		
		
		
		
		Object[]obj=(Object[])repo.fetchAggregateData();		
		System.out.println("Max price "+obj[0]);
		System.out.println("Min price "+obj[1]);
		System.out.println("Avg price "+obj[2]);
		System.out.println("Total rows "+obj[3]);
		System.out.println("Sum of sal"+obj[4]);
	}

}
