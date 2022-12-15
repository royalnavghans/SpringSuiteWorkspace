package com.beans.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import Dependson_Autowired_Qualifier.demoAnnotations.BeanOne;
import Dependson_Autowired_Qualifier.demoAnnotations.BeanThree;
import Dependson_Autowired_Qualifier.demoAnnotations.BeanTwo;

@Configuration 
public class AppConfig {
	
	@Bean
	@DependsOn(value={"beanthree","beanthree"})
	public BeanOne beanone() {
		return new BeanOne();
	}
	
	@Bean
	public BeanTwo beantwo() {
		return new BeanTwo();
	}
	
	@Bean	
	public BeanThree beanthree() {
		return new BeanThree();
	}

}
