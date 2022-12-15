package com.read.prop.file.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.read.prop.file.Product;

@PropertySource("app.properties")
@Configuration
public class AppConfigValue {
	@Value("${pid}")
	private Integer prodid;
	@Value("${pname}")
	private String prodname;
	@Value("${pcost}")
	private Double prodCost;
	
	@Bean
	public Product product() {		
		
		Product prod= new Product();
		prod.setProdId(prodid);
		prod.setProdName(prodname);
		prod.setProdCost(prodCost);
		return prod;
	}
	

}  
