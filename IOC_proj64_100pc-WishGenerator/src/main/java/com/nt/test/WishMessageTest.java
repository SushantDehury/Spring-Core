package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishGenerator;
import com.nt.config.BeanConfigurator;

public class WishMessageTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		WishGenerator wish = null;
		// crfeate IOC Container
		ctx = new AnnotationConfigApplicationContext(BeanConfigurator.class);
		// get bean
		wish = ctx.getBean("msg", WishGenerator.class);
		System.out.println(wish.generateWishMsg("Sushant"));

	}

}
