package com.nt.config;


import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
@PropertySource(value = { "classpath:com/nt/commons/jdbc.properties" })
public class PersistenceConfig {
	
	@Autowired
	private Environment env;
	
	@Bean("dataSource")
	public DataSource createDataSource() {
		org.apache.tomcat.jdbc.pool.DataSource dataSource=null;
		dataSource=new org.apache.tomcat.jdbc.pool.DataSource();
		dataSource.setDriverClassName(env.getRequiredProperty("driver"));
		dataSource.setUrl(env.getRequiredProperty("url"));
		dataSource.setUsername(env.getRequiredProperty("user"));
		dataSource.setPassword(env.getRequiredProperty("pwd"));
		return  dataSource;	
	}
	
	@Bean
	public JdbcTemplate createJBT() {
		JdbcTemplate jt=null;
		jt=new JdbcTemplate(createDataSource());
		return jt;
	}
	
	

}
