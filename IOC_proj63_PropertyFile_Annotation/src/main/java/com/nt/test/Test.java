package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Student;


public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		Student st=null;
		// create IOC Container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//	 get bean
		st = ctx.getBean("st", Student.class);
		System.out.println(st);
		
	}

}
