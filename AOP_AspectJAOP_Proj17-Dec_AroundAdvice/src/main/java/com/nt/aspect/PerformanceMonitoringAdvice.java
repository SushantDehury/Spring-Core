package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceMonitoringAdvice {
	private long start, end;

	public Object monitor(ProceedingJoinPoint pjp) throws Throwable {
		Object retVal = null;
		start = System.currentTimeMillis();
		retVal = pjp.proceed();
		System.out.println("Target ::" + pjp.getTarget() + "Method::" + pjp.getSignature() + "Argument::"
				+ Arrays.toString(pjp.getArgs()));
		return retVal;
	}

}
