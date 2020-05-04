package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ArithmeticOpreation;

public class PerformanceTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		ArithmeticOpreation proxy=null;
		// Create IOC Container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get bean
		proxy = ctx.getBean("proxy", ArithmeticOpreation.class);
		// Invoke the method
		System.out.println(proxy.add(10, 20));
		System.out.println("**********************************");
		System.out.println(proxy.add(10, 20));
		System.out.println("**********************************");
		System.out.println(proxy.add(10, 20));
		System.out.println("**********************************");
		System.out.println(proxy.mul(10, 20));
		System.out.println("=============================");
		System.out.println(proxy.dev(100, 20));
		System.out.println("=============================");
		System.out.println(proxy.sub(50, 20));
		System.out.println("**********************************");
		System.out.println(proxy.sub(50, 20));
		System.out.println("**********************************");
		System.out.println(proxy.sub(50, 20));
		System.out.println("**********************************");
		
		// close Container
		((AbstractApplicationContext) ctx).close();
	}

}
