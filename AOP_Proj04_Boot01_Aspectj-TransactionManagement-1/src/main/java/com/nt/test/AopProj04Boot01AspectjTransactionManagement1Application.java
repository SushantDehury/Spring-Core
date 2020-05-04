package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.nt.config.AopConfig;
import com.nt.config.PersistenceConfig;
import com.nt.config.ServiceConfig;
import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

@SpringBootApplication
@Import(value = {AopConfig.class,PersistenceConfig.class,ServiceConfig.class })
@EnableTransactionManagement
public class AopProj04Boot01AspectjTransactionManagement1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService proxy=null;
		EmployeeDTO dto=null;
		ctx=SpringApplication.run(AopProj04Boot01AspectjTransactionManagement1Application.class, args);
		proxy=ctx.getBean("eservice",EmployeeService.class);
		dto=new EmployeeDTO();
		dto.setEid(116);dto.setEname("raja");
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
