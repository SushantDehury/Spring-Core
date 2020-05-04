package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.target.ShoppingStore;

public class AfterAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		//Example proxy=null;
		ShoppingStore proxy=null;
		// Create IOC Container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get bean
		proxy = ctx.getBean("proxy", ShoppingStore.class);
		//proxy = ctx.getBean("proxy", Example.class);
		System.out.println(proxy.getClass());
		// Invoke the method
	System.out.println(proxy.calBillamount(new String[] {"PHONE","WATCH","WALLET","GLASS"}));
		// close Container
	((AbstractApplicationContext) ctx).close();
}

}
