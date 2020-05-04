package com.nt.Client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Bike;

public class ClientApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Bike bike = null;
		// create IOC Container
		factory = new DefaultListableBeanFactory();
		// create beanDefination reader
		reader = new XmlBeanDefinitionReader(factory);
		// load beanDefination
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// get bean id
		/*
		 * bike=factory.getBean("basebike",Bike.class);
		 * System.out.println(bike);
		 */
		bike = factory.getBean("honda", Bike.class);
		System.out.println(bike);
		bike = factory.getBean("hero", Bike.class);
		System.out.println(bike);
	}

}
