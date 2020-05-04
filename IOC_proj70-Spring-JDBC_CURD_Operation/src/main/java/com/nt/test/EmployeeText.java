package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EmployeeService;

public class EmployeeText {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService service=null;
		//create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs//applicationContext.xml");
		//get bean
		service=ctx.getBean("service",EmployeeService.class);
		//Invoke the method
		//System.out.println("Employee Count :: "+service.factchEmpCount());
		//System.out.println("Employee Record :: "+service.fatchEmployeeRecord(7566));
		//System.out.println("Employee Details :: "+service.fatchEmployeeDetails());
//		System.out.println(service.fatchEmployee(101, "Sushant", "Infosys", 6000));
		System.out.println("Get Salary:: "+service.factcEmpSalary(101));
		//System.out.println(service.UpdateSalHike(101));
		//close the Container
		((AbstractApplicationContext) ctx).close();

	}//main

}//class
