package com.nt.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.NameMatchMethodPointcut;

public class CachePointCut extends NameMatchMethodPointcut {
	@Override
	public boolean matches(Method arg0, Class<?> arg1) {
		// TODO Auto-generated method stub
		return super.matches(arg0, arg1);
	}

}
