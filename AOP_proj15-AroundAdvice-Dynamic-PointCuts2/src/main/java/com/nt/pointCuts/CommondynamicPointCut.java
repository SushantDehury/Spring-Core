package com.nt.pointCuts;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.nt.service.ArithmeticOpreation;

public class CommondynamicPointCut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> clzz, Object... args) {
		if (method.getName().equals("mul") && clzz == ArithmeticOpreation.class && ((Integer) args[0]) > 1000
				&& ((Integer) args[1]) > 1000)
			return true;
		if (method.getName().equals("sub") && clzz == ArithmeticOpreation.class && ((Integer) args[0]) > 1000
				&& ((Integer) args[1]) > 1000)
			return true;
		return false;
	}

}
