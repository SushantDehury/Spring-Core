package com.nt.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class ClientTestapp {

	public static void main(String[] args) {
		ApplicationContext ctx;
		Flipkart flipkart=null;
		
		//Locate the  cfgs file
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//	flipkart=ctx.getBean("flipkart", Flipkart.class);
	//	System.out.println(flipkart.shooping(new String[]{"shirt","chadi","gangi"}));
		

	}

}
