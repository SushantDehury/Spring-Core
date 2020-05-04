package com.nt.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.LoneAprove;

public class PerformanceTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		LoneAprove proxy=null;
		// Create IOC Container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get bean
		proxy = ctx.getBean("loneApp", LoneAprove.class);
		System.out.println(proxy.getClass());
		// Invoke the method
		System.out.println(proxy.aproveLone(101, "Sushant"));
		
		// close Container
		((AbstractApplicationContext) ctx).close();
	}

}
