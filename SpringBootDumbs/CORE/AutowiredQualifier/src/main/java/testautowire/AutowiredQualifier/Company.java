package testautowire.AutowiredQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
	
	@Autowired
	@Qualifier(value ="Employee2")
	private Employee employee;

	public  Company()
	{
		System.out.println("From Company");
	}
	
	public void printEmpName()
	{
		System.out.println("EmpName" + employee.getName());
	}
	
	public void printEmpAddress()
	{
		System.out.println("EmpAddress" + employee.getAddress());
	}
}
