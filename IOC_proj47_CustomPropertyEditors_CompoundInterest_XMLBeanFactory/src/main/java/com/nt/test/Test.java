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
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.PropertiesPersister;

import com.nt.beans.IntrLoanAmtCal;
import com.nt.beans.LoanDetails;
import com.nt.editors.CustomIntrLoanAmtcal;

public class Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		IntrLoanAmtCal simpleIntr = null;
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		factory.addPropertyEditorRegistrar(new PropertyEditorRegistrar() {

			@Override
			public void registerCustomEditors(PropertyEditorRegistry registry) {
				registry.registerCustomEditor(LoanDetails.class, new CustomIntrLoanAmtcal());

			}
		});
		simpleIntr = factory.getBean("simpleIntr", IntrLoanAmtCal.class);
		System.out.println(simpleIntr.simpleinteCal());

	}

}
