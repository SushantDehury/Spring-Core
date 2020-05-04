package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Student;
import com.nt.config.AppConfig;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Student std=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get bean
		std=ctx.getBean("hh",Student.class);
		

	}

}
