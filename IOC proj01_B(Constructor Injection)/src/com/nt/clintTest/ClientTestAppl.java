package com.nt.clintTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.beans.WishGenerator;

public class ClientTestAppl {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		
		WishGenerator wish1=null;
		//locate the IOC container in spring bean cfg file
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		/*wish1=ctx.getBean("wish",WishGenerator.class);
		System.out.println(wish1.generateWishMssg("Sushant"));*/
		
		
	}

}