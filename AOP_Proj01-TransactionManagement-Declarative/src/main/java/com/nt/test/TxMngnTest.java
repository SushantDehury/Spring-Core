package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

public class TxMngnTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService proxy=null;
		EmployeeDTO dto=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get proxy
		//proxy=ctx.getBean("eservice",EmployeeService.class);
		proxy=ctx.getBean("tpfb",EmployeeService.class);
		dto=new EmployeeDTO();
		dto.setEid(110);dto.setEname("raja");
		dto.setDesg("HYD");dto.setSal(1000);
		try {
			//invoke the methiod
			System.out.println(proxy.registerEmployee(dto));
		}catch (Exception e) {
			e.printStackTrace();
		}
		//close container
		((AbstractApplicationContext) ctx).close();
	}

}