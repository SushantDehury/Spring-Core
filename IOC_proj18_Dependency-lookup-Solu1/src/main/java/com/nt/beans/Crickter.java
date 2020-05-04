package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Crickter {
	private String name;
	private String bat;

	public void setBat(String bat) {
		this.bat = bat;
	}

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

	public void batting(DefaultListableBeanFactory factory) {
		System.out.println(name + " is batting....");
		Bat bt=null;
		bt=factory.getBean(bat,Bat.class);
		bt.hitting();

	}
}
