package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Flipkart fkt=null;
		ctx=new  ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		/*fkt=ctx.getBean("flipkart", Flipkart.class);
		System.out.println(fkt.shooping(new String[]{"shirt","chadi","gangi"}));*/
		

	}

}
