package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.target.PinGenerator;

public class PinGenAfterAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		//Example proxy=null;
		PinGenerator proxy=null;
		// Create IOC Container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get bean
		proxy = ctx.getBean("proxy", PinGenerator.class);
		//proxy = ctx.getBean("proxy", Example.class);
		System.out.println(proxy.getClass());
		// Invoke the method
	System.out.println(proxy.generatePin(1234));
		// close Container
	((AbstractApplicationContext) ctx).close();
}

}
