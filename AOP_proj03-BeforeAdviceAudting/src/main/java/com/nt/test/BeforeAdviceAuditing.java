package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.target.LoneAprove;

public class BeforeAdviceAuditing {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		//Example proxy=null;
		LoneAprove proxy=null;
		// Create IOC Container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get bean
		proxy = ctx.getBean("proxy", LoneAprove.class);
		//proxy = ctx.getBean("proxy", Example.class);
		System.out.println(proxy.getClass());
		// Invoke the method
	System.out.println(proxy.aproveLone(1001,"Sushant"));
		// close Container
	((AbstractApplicationContext) ctx).close();
}

}
