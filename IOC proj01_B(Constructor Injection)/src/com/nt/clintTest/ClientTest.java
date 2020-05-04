package com.nt.clintTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.WishGenerator;

public class ClientTest {

	public static void main(String[] args) {
		ClassPathResource res=null;
		BeanFactory factory=null;
		WishGenerator wish1=null;
		//locate the IOC container in spring bean cfg file
		res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		//activate the IOC container
		factory=new XmlBeanFactory(res);
		wish1=(WishGenerator)factory.getBean("wish");
		System.out.println(wish1.generateWishMssg("Sushant"));

	}

}
