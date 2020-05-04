package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishGenerator;

public class ClientApp {

	public static void main(String[] args) {
		FileSystemResource res = null;
		BeanFactory factory = null;
		WishGenerator say = null;
		// locate the applicationContext file
		res = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		// Activate BeanFactory container or IOC contatner
		factory = new XmlBeanFactory(res);
		// Get bean class obj
		say=(WishGenerator)factory.getBean("wish");
		//call b logic
		String generateWishMssg = say.generateWishMssg("Sushant");
		System.out.println(generateWishMssg);
		
	}
	

}
