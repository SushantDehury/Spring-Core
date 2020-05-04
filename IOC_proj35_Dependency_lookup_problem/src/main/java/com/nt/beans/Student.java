package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
	private String name;
	private String beanTag;
	

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
	public String study(ApplicationContext ctx) {
		Subject sub=null;
		String result=null;
		sub=ctx.getBean("sub",Subject.class);
		result=sub.subjectDetails();
		return result;
	}
}
