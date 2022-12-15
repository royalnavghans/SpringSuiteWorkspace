package testautowire.AutowiredQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autoconfig.xml");
		Company company = context.getBean(Company.class);
		company.printEmpName();
		company.printEmpAddress();
		
	}

}
