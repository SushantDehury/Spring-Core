package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Addition;
import com.nt.beans.ResultAdd;
import com.nt.editors.CustomAddition;

public class Test01 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		ResultAdd add;

		// create IOC Container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		factory.addPropertyEditorRegistrar(registery -> {
			registery.registerCustomEditor(Addition.class, new CustomAddition());
		});
		add = factory.getBean("add", ResultAdd.class);
		System.out.println(add.add());
	}

}
