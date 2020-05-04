package com.nt.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.PropertiesPersister;

import com.nt.beans.IntrLoanAmtCal;
import com.nt.beans.LoanDetails;
import com.nt.editors.CustomIntrLoanAmtcal;

public class Test01 {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		IntrLoanAmtCal simpleIntr = null;

		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		simpleIntr = ctx.getBean("simpleIntr", IntrLoanAmtCal.class);
		System.out.println(simpleIntr.simpleinteCal());

	}

}
