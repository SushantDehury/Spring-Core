package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.target.Calculator;

public class ThrowsAdviceText {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		//Example proxy=null;
		Calculator cal=null;
		// Create IOC Container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get bean
		cal = ctx.getBean("proxy", Calculator.class);
		// Invoke the method
		try {
			System.out.println(cal.add(4, 0));
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		// close Container
	((AbstractApplicationContext) ctx).close();
}

}
