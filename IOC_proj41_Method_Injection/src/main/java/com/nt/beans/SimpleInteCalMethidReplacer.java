package com.nt.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class SimpleInteCalMethidReplacer implements MethodReplacer {
	float rate;

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public Object reimplement(Object target, Method method, Object[] args) throws Throwable {
		float pamt=(float) args[0];
		float time=(float)args[1];
		return (pamt*rate*time/100);
	}

}
