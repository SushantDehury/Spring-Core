package com.nt.aspect;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.AfterReturningAdvice;

public class DiscountCuponGenerator implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object retVal, Method method, Object[] args, Object target) throws Throwable {
		float billamt = (Float) retVal;
		FileWriter writer = new FileWriter("Z:\\DiscountCupon");
		String msg = null;
		System.out.println(method.getName());
		System.out.println(target.getClass());
		for (Object arg : args) {
			System.out.println(Arrays.toString((String[]) arg));
		}
		if (billamt <= 3000)
			msg = "30% Discount in Next purchase....Thunk u for shopping..";
		else if (billamt <= 5000)
			msg = "40% Discount in Next purchase....Thunk u for shopping..";
		else if (billamt <= 8000)
			msg = "50% Discount in Next purchase....Thunk u for shopping..";
		else
			msg = "50% Discount in Next purchase....Thunk u for shopping..";
		writer.write(msg);
		writer.flush();
		writer.close();
	}

}
