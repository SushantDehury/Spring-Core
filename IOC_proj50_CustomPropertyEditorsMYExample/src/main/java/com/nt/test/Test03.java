package com.nt.test;

import java.beans.PropertyEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Addition;
import com.nt.beans.ResultAdd;
import com.nt.editors.CustomAddition;

public class Test03 {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ResultAdd add=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext01.xml");
		add=ctx.getBean("add",ResultAdd.class);
		System.out.println(add.add());
	}

}
