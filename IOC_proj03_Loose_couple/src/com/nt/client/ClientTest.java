package com.nt.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Flipkart;

public class ClientTest {

	public static void main(String[] args) {
		ClassPathResource res=null;
		BeanFactory factory=null;
		Flipkart flipkart=null;
		
		//Locate the  cfgs file
		res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		//Activate Bean factory
		factory=new XmlBeanFactory(res);
		flipkart=factory.getBean("flipkart", Flipkart.class);
		System.out.println(flipkart.shooping(new String[]{"shirt","chadi","gangi"}));
		

	}

}
