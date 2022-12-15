package com.prop.file.test;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.read.prop.file.Product;
import com.read.prop.file.config.AppConfig;
import com.read.prop.file.config.AppConfig1;
//import com.read.prop.file.config.AppConfig;
//import com.read.prop.file.config.AppConfig1;
import com.read.prop.file.config.AppConfigValue;

public class Test {
	
@SuppressWarnings("resource")

public static void main(String[] args) {
		// TODO Auto-generated method stub

ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

Product product = context.getBean(Product.class);

System.out.println(product);

	}

}
