package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.DAOImpl;

public class PropertyTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		DAOImpl dao = null;
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		dao = ctx.getBean("dao", DAOImpl.class);
		try {
			dao.RetriveEmp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
