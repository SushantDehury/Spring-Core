package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Student {
	private String name;

	
	public abstract Subject getSubject();
	
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
		
		String result=null;
		Subject sub=getSubject();
		result=sub.subjectDetails();
		return result;
	}
}
