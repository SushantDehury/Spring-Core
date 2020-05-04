package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AopConfig;
import com.nt.config.PersistenceConfig;
import com.nt.config.ServiceConfig;
import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

@SpringBootApplication
@Import(value = {AopConfig.class,PersistenceConfig.class,ServiceConfig.class })
public class AopProj04Boot01TransactionManagementApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeService proxy=null;
		EmployeeDTO dto=null;
		ctx=SpringApplication.run(AopProj04Boot01TransactionManagementApplication.class, args);
		proxy=ctx.getBean("tpfb",EmployeeService.class);
		dto=new EmployeeDTO();
		dto.setEid(107);dto.setEname("raja");
		dto.setDesg("HYD");dto.setSal(1000);
		try {
			//invoke the methiod
			System.out.println(proxy.registerEmployee(dto));
		}catch (Exception e) {
			e.printStackTrace();
		}
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}
}
