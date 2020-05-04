package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Presion;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Presion per=null;
		//create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean
		per=ctx.getBean("per",Presion.class);
		System.out.println(per);
	}

}
