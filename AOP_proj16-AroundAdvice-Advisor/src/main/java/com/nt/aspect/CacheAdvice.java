package com.nt.aspect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor {
	Map<String, Object> cache = new HashMap();

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal = null;
		String key = null;
		// prepared key
		key = invocation.getMethod().getName() + Arrays.toString(invocation.getArguments());
		if (!cache.containsKey(key)) {
			retVal = invocation.proceed();
			cache.put(key, retVal);
		}
		retVal = cache.get(key);
		return retVal;
	}

}
