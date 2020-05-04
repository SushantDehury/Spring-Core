package com.nt.aspect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;

public class CacheAdvice {
	private Map<String, Object> cache = new HashMap();

	public Object cache(ProceedingJoinPoint pjp) throws Throwable {
		String key = null;
		Object retVal = null;
		key = pjp.getSignature() + "" + Arrays.toString(pjp.getArgs());
		if (!cache.containsKey(key)) {
			retVal = pjp.proceed();
			cache.put(key, retVal);
			System.out.println("in " + pjp.getSignature());
			return retVal;
		} else {
			retVal = cache.get(key);
			System.out.println("From cache...");
			return retVal;
		}
	}
}
