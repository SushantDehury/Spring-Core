package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.target.Example;
import com.nt.target.IntrAmtCal;

public class PerformanceTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		//Example proxy=null;
		IntrAmtCal proxy=null;
		// Create IOC Container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get bean
		proxy = ctx.getBean("proxy", IntrAmtCal.class);
		//proxy = ctx.getBean("proxy", Example.class);
		System.out.println(proxy.getClass());
		// Invoke the method
		System.out.println(proxy.simpleIntrCal(1000, 2, 12));
		
		System.out.println(proxy.simpleIntrCal(1000, 2, 12));
		
		System.out.println(proxy.simpleIntrCal(1000, 4, 12));
		// close Container

}

}
