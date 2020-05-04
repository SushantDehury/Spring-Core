package com.nt.Client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Crickter;

public class ClientApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Crickter cktr = null;
		// create IOC Container
		factory = new DefaultListableBeanFactory();
		// create beanDefination reader
		reader = new XmlBeanDefinitionReader(factory);
		// load beanDefination
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// get Bean id
		cktr = factory.getBean("cktr", Crickter.class);
		cktr.batting(factory);
		System.out.println("----------------------------------");
		cktr.bolling();
		System.out.println("----------------------------------");
		cktr.fielding();
		System.out.println("----------------------------------");
		cktr.keeping();
	}

}
