package Dependson_Autowired_Qualifier.demoAnnotations;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanOne {
	
	@Autowired
	private BeanTwo beantwo;
	
	@Autowired
	private BeanThree beanthree;
	
	   public BeanOne() {
		System.out.println("Bean One");
	   }
	}
