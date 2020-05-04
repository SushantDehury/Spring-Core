package com.nt.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class BeanConfigurator {

	static {
		System.out.println("Configurator class is loaded");
	}
	@Bean("cal")
	public Calendar getCalendar() {
		System.out.println("calendar class obj is created");
		return Calendar.getInstance();
	}

}
