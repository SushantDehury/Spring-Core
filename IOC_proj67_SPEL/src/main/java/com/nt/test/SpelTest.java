package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Shopping;

public class SpelTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Shopping shop=null;
		//create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//grt bean
		shop=ctx.getBean("shop",Shopping.class);
		System.out.println(shop);
		//System.out.println(System.getProperties());
		((AbstractApplicationContext) ctx).close();

	}

}
