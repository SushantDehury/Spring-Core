package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishGenerator;

public class ClientApp {
	public static void main(String[] args) {
		System.out.println("Client App main(--)");
		//locate spring beans configuration file
		FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//Active beanFactory container
		XmlBeanFactory factory=new XmlBeanFactory(res);
		WishGenerator bean=(WishGenerator)factory.getBean("wish");
		//calls b.logic
		String result=bean.generatorWishMsg();
		System.out.println(result);
	}//main

}//class
