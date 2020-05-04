package com.nt.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.ProductController;

public class ClientTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		ProductController controller = null;
		// create IOC Container
		factory = new DefaultListableBeanFactory();
		// load the bean cfgs file
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// get bean id
		try {
			controller = factory.getBean("controller", ProductController.class);
			System.out.println(controller.Generrator("Quick-Heal", "00"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
