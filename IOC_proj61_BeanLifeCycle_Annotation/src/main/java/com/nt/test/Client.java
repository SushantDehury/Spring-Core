package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoterApp;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		VoterApp vote=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get the bean
		vote=ctx.getBean("vapp",VoterApp.class);
		System.out.println(vote.voteElgible());
		((AbstractApplicationContext) ctx).close();
		

	}

}
