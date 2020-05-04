package com.nt.aspect;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class AuditingAdvice {
	
	public void audit(JoinPoint jp,int orderId,String name) throws Throwable{
		Object args[]=jp.getArgs();
		FileWriter write=null;
		String mr="Mr.";
		System.out.println("Target method Signatuse"+jp.getSignature());
		System.out.println("Arguments"+Arrays.toString(jp.getArgs()));
	//	System.out.println(name);
		mr=mr+args[1];
		write=new FileWriter("Z://AuditingFile",true);
		write.write(mr+" "+"{"+name+"}"+"Your orderId "+args[0]+" has came for "+new Date()+"\n");
		write.flush();
		write.close();
	}

}
