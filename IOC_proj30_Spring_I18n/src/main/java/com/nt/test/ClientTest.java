package com.nt.test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Locale locale,locale1=null;
		JFrame fram=null;
		JButton bt1,bt2,bt3,bt4=null;
		
		//create applicationContext obj
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		locale=new Locale("hi","IN");
		locale1=new Locale("cn","CHINA");
		String s1=ctx.getMessage("Lable1", null,"msg1", locale);
		String s2=ctx.getMessage("Lable2", null,"msg2", locale);
		String s3=ctx.getMessage("Lable3", new Object[] {"fuck"},"msg3", locale1);
		String s4=ctx.getMessage("Lable4", new Object[] {"suck"},"msg4", locale1);
		fram=new JFrame();
		fram.setLayout(new FlowLayout());
		bt1=new JButton(s1);
		bt2=new JButton(s2);
		bt3=new JButton(s3);
		bt4=new JButton(s4);
		fram.add(bt1);
		fram.add(bt2);
		fram.add(bt3);
		fram.add(bt4);
		fram.setVisible(true);
		fram.pack();
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		((AbstractApplicationContext) ctx).close();
		

	}

}
