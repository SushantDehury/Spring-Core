package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.College;

public class ClientTest {
	public static void main(String[] args) {
		ApplicationContext ctxP = null, ctxC = null;
		College clg=null;
		ctxP=new ClassPathXmlApplicationContext("com/nt/cfgs/parent_bean.xml");
		ctxC=new ClassPathXmlApplicationContext(new String[] {"com/nt/cfgs/child_bean.xml"},ctxP);
		clg=ctxC.getBean("clg",College.class);
		System.out.println(clg);
		((AbstractApplicationContext) ctxC).close();
		((AbstractApplicationContext) ctxP).close();
	}

}
