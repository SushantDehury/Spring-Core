package com.nt.test;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoterApp;

public class Test1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		VoterApp voter = null;
		// create IOC Container
		factory = new DefaultListableBeanFactory();
		// create reader
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		factory.addBeanPostProcessor(new RequiredAnnotationBeanPostProcessor());

		// geet bean
		voter = factory.getBean("voter", VoterApp.class);
		System.out.println(voter);

	}

}
