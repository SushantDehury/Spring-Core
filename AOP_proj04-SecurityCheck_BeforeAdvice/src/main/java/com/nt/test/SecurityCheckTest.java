package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.aspect.AuthenticationManager;
import com.nt.service.BankService;

public class SecurityCheckTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AuthenticationManager manager=null;
		BankService proxy=null;
		//create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean
		manager=ctx.getBean("manager",AuthenticationManager.class);
		//manager.logIn("raja", "rani");
		//invalid username and password
		manager.logIn("raja", "rani1");
		proxy=ctx.getBean("pfb",BankService.class);
	
		try {
			System.out.println(proxy.withdraw(100001, 500));
			System.out.println("============================");
			System.out.println(proxy.deposit(100001, 50));
		}catch (Exception e) {
			e.printStackTrace();
		}
		manager.logOut();
		((AbstractApplicationContext) ctx).close();
	}

}
