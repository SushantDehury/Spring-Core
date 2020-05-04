package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.target.IntrAmtCal;

public class PerformanceTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		IntrAmtCal proxy=null;
		// Create IOC Container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get bean
		proxy = ctx.getBean("proxy", IntrAmtCal.class);
		// Invoke the method
		System.out.println(proxy.simpleIntrCal(1000, 2, 12));
		// close Container
		((AbstractApplicationContext) ctx).close();
	}

}
