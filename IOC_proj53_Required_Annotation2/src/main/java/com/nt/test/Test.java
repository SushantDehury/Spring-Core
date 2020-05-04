package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.AdharCard;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		AdharCard adhar=null;
		// create IOC Container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get bean
		adhar=ctx.getBean("adhar",AdharCard.class);
		System.out.println(adhar);
	
	}

}
