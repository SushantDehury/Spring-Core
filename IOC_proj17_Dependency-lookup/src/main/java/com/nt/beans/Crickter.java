package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Crickter {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public Crickter() {
		System.out.println("Crickter 0-param Constructor");
	}

	public void bolling() {
		System.out.println(name + " is bolling....");

	}

	public void keeping() {
		System.out.println(name + " is keeping....");

	}

	public void fielding() {
		System.out.println(name + " is fielding....");

	}

	public void batting() {
		System.out.println(name + " is batting....");
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Bat bat=null;
		//create IOC Container
		factory=new DefaultListableBeanFactory();
		//create XmlBeanDefination
		reader=new XmlBeanDefinitionReader(factory);
		//load BeanDefinations
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		bat=factory.getBean("bat",Bat.class);
		bat.hitting();

	}
}
