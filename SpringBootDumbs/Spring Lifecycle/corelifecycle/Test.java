package com.spring.corelifecycle;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// registering shutdown hook
		context.registerShutdownHook();
			//	mobile s1 = (mobile) context.getBean("s1");
			//System.out.println(s1);
//
//		System.out.println("++++++++++++++++++++++++++++");
			laptopiface p1 = (laptopiface) context.getBean("p1");
//
			System.out.println(p1);
		
			//Example example=(Example) context.getBean("example");
		
			//System.out.println(example);

	}

}
