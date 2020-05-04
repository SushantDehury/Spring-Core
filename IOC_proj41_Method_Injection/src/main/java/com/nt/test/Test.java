package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.SimpleIntrRateCal;


public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		SimpleIntrRateCal csi=null;
		//create AppklicationContext obj
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		csi=ctx.getBean("csi",SimpleIntrRateCal.class);
		System.out.println(csi.getClass()+"\n"+csi.getClass().getSuperclass());
		System.out.println(csi.calSimpIntr(100, 100));
		
	}

}
