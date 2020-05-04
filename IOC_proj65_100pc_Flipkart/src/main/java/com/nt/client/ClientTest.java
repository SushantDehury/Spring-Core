package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Flipkart;
import com.nt.config.AppConfig;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Flipkart flipkart=null;
		//create IOC Container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get bean
		flipkart=ctx.getBean("fkt",Flipkart.class);
		System.out.println(flipkart.shooping(new String[]{"shirt","chadi","gangi"}));
		

	}

}
