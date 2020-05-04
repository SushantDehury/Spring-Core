package com.nt.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long start,end=0;
		start=System.currentTimeMillis();
		System.out.println("Class name::"+invocation.getClass()+"  Method::"+invocation.getMethod());
		System.out.println("Before executing Target method");
		Object retval=invocation.proceed();
		end=System.currentTimeMillis();
		System.out.println("After Comming target Method execution");
		System.out.println("Total time::"+(start-end));
		System.out.println("Class name::"+invocation.getClass()+"  Method::"+invocation.getMethod()+"Arguments::"+invocation.getArguments());
		
		return retval;
	}

}
