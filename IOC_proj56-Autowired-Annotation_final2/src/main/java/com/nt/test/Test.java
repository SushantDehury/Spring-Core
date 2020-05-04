package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.DTDC;
import com.nt.beans.Flipkart;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		Flipkart fkt = null;
		// create IOC Container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get bean
		fkt = ctx.getBean("fkt", Flipkart.class);
		System.out.println(fkt.shooping(new String[] { "pant", "chadi", "gangi" }));
	}

}
