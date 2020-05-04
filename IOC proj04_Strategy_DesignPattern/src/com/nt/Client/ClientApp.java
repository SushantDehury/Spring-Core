package com.nt.Client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Vehicle;

public class ClientApp {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Vehicle vehicle=null;
		
		//create IOC Container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//Write bv logic
		vehicle=factory.getBean("vehicle", Vehicle.class);
		vehicle.move();
		System.out.println("-------------------------------");
		vehicle.parking();
		

	}

}
