package com.nt.test;

import java.beans.PropertyEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Addition;
import com.nt.beans.ResultAdd;
import com.nt.editors.CustomAddition;

public class Test04 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		ResultAdd add;

		// create IOC Container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext01.xml");
		
		BeanFactoryPostProcessor pros=null;
		pros=factory.getBean(BeanFactoryPostProcessor.class);
		pros.postProcessBeanFactory(factory);
		
		add = factory.getBean("add", ResultAdd.class);
		System.out.println(add.add());
	}

}
