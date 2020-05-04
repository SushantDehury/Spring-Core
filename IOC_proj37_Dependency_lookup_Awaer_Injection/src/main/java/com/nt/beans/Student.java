package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student implements ApplicationContextAware{
	private String name;
	private String beanTag;
	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
		
	}
	

	public void setBeanTag(String beanTag) {
		this.beanTag = beanTag;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
		System.out.println("Student class 0-param Constructor");
	}
	public String playing(){
		return name+" is playing cricket . . .";
	}
	public String watching() {
		return name+" is watching TIGRT ZINDA HAI movie . . ."; 
	}
	public String study() {
		Subject sub=null;
		String result=null;
		sub=ctx.getBean("sub",Subject.class);
		result=sub.subjectDetails();
		return result;
	}
	
}
