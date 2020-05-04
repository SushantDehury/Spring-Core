package com.nt.aspect;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class AuditingAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		FileWriter fw=null;
		String name="Mr. ";
		System.out.println(method.getName());
		System.out.println(Arrays.toString(args));
		System.out.println(target.getClass());
		name=name+(String)args[1];
		args[1]=name;
		if ((Integer) args[0] == 0) {
			throw new IllegalArgumentException("invalid OrderId");
		}
		if ((Integer) args[0] > 0) {
			fw=new FileWriter("Z:\\Auditing",true);
			fw.write(args[1]+" your orderId "+args[0]+" has come for "+new Date()+" \n");
			fw.flush();
			fw.close();
		}
		
		
	}

}
