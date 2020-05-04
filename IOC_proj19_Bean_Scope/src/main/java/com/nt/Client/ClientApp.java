package com.nt.Client;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class ClientApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Calendar cal = null;
		Class clzz = null;
		String sb1,sb2 = null;

		// create IOC Container
		factory = new DefaultListableBeanFactory();
		// create beanDefination reader
		reader = new XmlBeanDefinitionReader(factory);
		// load beanDefination
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// get Bean id
		cal = factory.getBean("cal", Calendar.class);
		System.out.println(cal.getClass() + "========" + cal.toString());
		System.out.println("----------------------------------");
		clzz = factory.getBean("clzz", Class.class);
		System.out.println(clzz.getClass() + "========" + clzz.toString());
		System.out.println("----------------------------------");

		sb1 = factory.getBean("sb1", String.class);
		System.out.println(sb1.getClass() + "========" + sb1);
		System.out.println("----------------------------------");

		sb2 = factory.getBean("sb2", String.class);
		System.out.println(sb2.getClass() + "========" + sb2);
		System.out.println("----------------------------------");

	}

}
