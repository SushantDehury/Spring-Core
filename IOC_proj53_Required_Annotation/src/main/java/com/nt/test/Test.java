package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoterApp;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		VoterApp voter = null;
		// create IOC Container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// geet bean
		voter = ctx.getBean("voter", VoterApp.class);
		System.out.println(voter);

	}

}
