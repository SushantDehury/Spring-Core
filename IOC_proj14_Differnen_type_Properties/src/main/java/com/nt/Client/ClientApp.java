package com.nt.Client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Employee;
import com.nt.beans.Faculty;
import com.nt.beans.Gulab;
import com.nt.beans.Mobile;
import com.nt.beans.Student;

public class ClientApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Student student = null;
		Gulab gulab = null;
		Mobile mobile = null;
		Faculty faculty = null;
		Employee employee = null;
		// create IOC Container
		factory = new DefaultListableBeanFactory();
		// create beanDefination reader
		reader = new XmlBeanDefinitionReader(factory);
		// load beanDefination
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		// get bean id
		student = factory.getBean("student", Student.class);
		System.out.println(student);
		System.out.println("-------------------------------------------------------------------");
		gulab = factory.getBean("gulab", Gulab.class);
		System.out.println(gulab);
		System.out.println("-------------------------------------------------------------------");
		mobile = factory.getBean("mobile", Mobile.class);
		System.out.println(mobile);
		System.out.println("-------------------------------------------------------------------");
		faculty = factory.getBean("faculty", Faculty.class);
		System.out.println(faculty);

		System.out.println("-------------------------------------------------------------------");
		employee = factory.getBean("employee", Employee.class);
		System.out.println(employee);
	}

}
