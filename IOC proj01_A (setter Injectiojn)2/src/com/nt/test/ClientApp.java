package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishGenerator;

public class ClientApp {

	public static void main(String[] args) {
		/*DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		WishGenerator say=null;
		factory=new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
*/
		WishGenerator say=null;
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println( ctx.getClass());
//		say = (WishGenerator) ctx.getBean("wish");
		//say = (WishGenerator) factory.getBean("wish");
		// call b logic
		/*String generateWishMssg = say.generateWishMssg("Sushant");
		System.out.println(generateWishMssg);*/
	}

}
