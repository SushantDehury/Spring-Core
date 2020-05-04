package com.nt.config;

import java.util.Properties;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.interceptor.NameMatchTransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionProxyFactoryBean;

import com.nt.service.EmployeeService;

@Configuration
@EnableTransactionManagement
public class AopConfig {

	@Autowired
	private DataSource ds;


	@Bean("dsTm")
	public DataSourceTransactionManager createDSTM() {
		DataSourceTransactionManager tm = new DataSourceTransactionManager();
		tm.setDataSource(ds);
		return tm;
	}

	

}
