package com.read.prop.file.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.read.prop.file.Product;


@Configuration
public class AppConfig1 {
	
	
	
	@Bean
	public Product product() {		
		
		Product prod= new Product();
		prod.setProdId(1111);
		prod.setProdName("TV");
		prod.setProdCost(90000.00);
		return prod;
	}
}
