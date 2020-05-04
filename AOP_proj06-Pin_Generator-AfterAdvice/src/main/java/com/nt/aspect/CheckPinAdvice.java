package com.nt.aspect;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.AfterReturningAdvice;

public class CheckPinAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object retVal, Method method, Object[] args, Object target) throws Throwable {
		int pin=(Integer)retVal;
		System.out.println(pin);
		System.out.println(method.getName());
		System.out.println(target.getClass());
		System.out.println(Arrays.toString(args));
		
		if(pin<9999)
			throw new IllegalArgumentException("Invalid PIN");
	}

}
