package com.nt.client;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.StudentController;

final class ClientTest {

	public static void main(String[] args) {
		BeanFactory factory = null;
		StudentController controller = null;
		// Create IOC container
		factory = new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		controller = factory.getBean("stcontroller", StudentController.class);
		try {
			System.out.println(controller.resultTotalMark("|Sushant", "78", "80", "90"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
