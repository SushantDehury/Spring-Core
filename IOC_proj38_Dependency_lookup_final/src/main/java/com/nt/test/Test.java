package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Student stud=null;
		//create AppklicationContext obj
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		stud=ctx.getBean("stud",Student.class);
		System.out.println(stud.playing());
		System.out.println(stud.watching());
		System.out.println(stud.study());
		System.out.println(stud.study());
		((AbstractApplicationContext) ctx).close();

	}

}
