
package com.nt.aspect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PreformanceMonitoringAdvice1 implements MethodInterceptor {
	
	Map<String,Object> map=new HashMap();

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
	
		String key=invocation.getMethod().getName()+Arrays.toString(invocation.getArguments());
		Object retval=null;
		if(!map.containsKey(key)) {
			System.out.println("In cache");
			retval= invocation.proceed();
			map.put(key, retval);
			return retval;
		}
		
		retval=map.get(key);
			return retval;
		
	}

}
