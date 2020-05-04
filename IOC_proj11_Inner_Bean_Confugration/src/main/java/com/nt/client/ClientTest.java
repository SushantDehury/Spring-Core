package com.nt.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Persion;

public class ClientTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Persion persion = null;
		// create IOC Container
		factory = new DefaultListableBeanFactory();
		// Create Reader
		reader = new XmlBeanDefinitionReader(factory);
		// read spring bean configurytion file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// get bean id
		persion = factory.getBean("com.nt.beans.Persion#0", Persion.class);
		System.out.println(persion);

	}

}
