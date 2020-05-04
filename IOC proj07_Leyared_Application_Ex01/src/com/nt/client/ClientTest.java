package com.nt.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.EmployeeController;

public class ClientTest {

	public static void main(String[] args) {
		BeanFactory factory = null;
		EmployeeController controller = null;
		// create IOC container
		factory = new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		// Get bean
		controller = factory.getBean("empcontroller", EmployeeController.class);
		try {
			System.out.println(controller.resultGenerator("105", "sushant", "60000"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
