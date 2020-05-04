package com.nt.config;

import java.util.Properties;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.interceptor.NameMatchTransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionProxyFactoryBean;

import com.nt.service.EmployeeService;

@Configuration
public class AopConfig {

	@Autowired
	private DataSource ds;
	@Autowired
	private EmployeeService service;

	@Bean("dsTm")
	public DataSourceTransactionManager createDSTM() {
		DataSourceTransactionManager tm = new DataSourceTransactionManager();
		tm.setDataSource(ds);
		return tm;
	}

	@Bean("nmtas")
	public NameMatchTransactionAttributeSource createNMTAS() {
		NameMatchTransactionAttributeSource source = null;
		Properties pors = null;
		source = new NameMatchTransactionAttributeSource();
		pors = new Properties();
		pors.setProperty("egisterEmployee", "PROPAGATION_REQUIRED");
		source.setProperties(pors);
		return source;
	}
	
	@Bean("tpfb1")
	public TransactionProxyFactoryBean createTPFB() {
		TransactionProxyFactoryBean proxy=null;
		proxy=new TransactionProxyFactoryBean();
		proxy.setTarget(service);
		proxy.setTransactionAttributeSource(createNMTAS());
		proxy.setTransactionManager(createDSTM());
		return proxy;
	}
	@Bean("tpfb")
	public EmployeeService getProxy() {
		return (EmployeeService) createTPFB().getObject();
	}

}
