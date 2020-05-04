package com.nt.aspect;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMoniAdcice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long start = 0L;
		long end = 0L;
		Object retval = null;
		start = System.currentTimeMillis();
		retval = invocation.proceed();
		end = System.currentTimeMillis();
		System.out.println("The total performance of " + invocation.getClass() + " of method::"
				+ invocation.getMethod().getName() + "\n with arguments " + Arrays.toString(invocation.getArguments())
				+ " Executing Time:: " + (start - end));

		return retval;
	}

}
