package com.nt.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.nt.service.Calculator;

public class PerformanceMonitoringpointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> target) {
		if (method.getName().equalsIgnoreCase("add") && target == Calculator.class )
			return true;
		if (method.getName().equalsIgnoreCase("dev") && target == Calculator.class )
			return true;
		return false;
	}

}
