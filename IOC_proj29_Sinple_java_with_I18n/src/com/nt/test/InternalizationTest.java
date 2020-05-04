package com.nt.test;

import java.awt.FlowLayout;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InternalizationTest {

	public static void main(String[] args) {
		Locale locale=null;
		ResourceBundle bundle=null;
		JFrame frame=null;
		JButton bt1,bt2,bt3,bt4,bt5=null;
		//create locale obj
		locale=new Locale(args[0],args[1]);
		//create ResourceBundle
		bundle=ResourceBundle.getBundle("com/nt/commons/App",locale);
		//create JFream
		frame=new JFrame();
		frame.setLayout(new  FlowLayout());
		//create button
		bt1=new JButton(bundle.getString("Lable1"));
		bt2=new JButton(bundle.getString("Lable2"));
		bt3=new JButton(bundle.getString("Lable3"));
		bt4=new JButton(bundle.getString("Lable4"));
		frame.add(bt1);
		frame.add(bt2);
		frame.add(bt3);
		frame.add(bt4);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
