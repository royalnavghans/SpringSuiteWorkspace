package com.SpringBoot.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfileApplication.class, args);
	}

}
