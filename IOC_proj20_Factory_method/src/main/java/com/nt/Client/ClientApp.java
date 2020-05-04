package com.nt.Client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.WishGenerator;

public class ClientApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		WishGenerator wt1, wt2 = null;

		// create IOC Container
		factory = new DefaultListableBeanFactory();
		// create beanDefination reader
		reader = new XmlBeanDefinitionReader(factory);
		// load beanDefination
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// get Bean id
		wt1 = factory.getBean("wt", WishGenerator.class);
		System.out.println(wt1.generateWishMssg("Sushant"));

		wt2 = factory.getBean("wt", WishGenerator.class);
		System.out.println(wt2.generateWishMssg("soumya"));
		
		System.out.println(wt1.hashCode());
		System.out.println(wt2.hashCode());
		System.out.println(wt1==wt2);

	}

}
