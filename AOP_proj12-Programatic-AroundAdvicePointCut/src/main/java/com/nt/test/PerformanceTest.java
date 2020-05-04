package com.nt.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

import com.nt.aspect.CacheAdvice;
import com.nt.aspect.PerformanceMoniAdcice;
import com.nt.pointcut.PerformanceMonitoringpointcut;
import com.nt.service.Calculator;

public class PerformanceTest {

	public static void main(String[] args) {
		ProxyFactory factory=null;
		Calculator cal,proxy=null;
		PerformanceMoniAdcice padvice=null;
		DefaultPointcutAdvisor advisor=null;
		
		//create target class obj
		cal=new Calculator();
		//create aAdvice calss obj
		padvice=new PerformanceMoniAdcice();
		//create ProxyFactory obj
		factory=new ProxyFactory();
		factory.setTarget(cal);
		NameMatchMethodPointcut pcuts=new NameMatchMethodPointcut();
		pcuts.addMethodName("add");
		pcuts.addMethodName("dev");
		NameMatchMethodPointcut pcuts1=new NameMatchMethodPointcut();
		pcuts1.addMethodName("mul");
		pcuts1.addMethodName("sub");
		advisor.setPointcut(pcuts);
		advisor.setPointcut(pcuts1);
		factory.addAdvisor(advisor);
		
		
		proxy=(Calculator) factory.getProxy();
		//Invoke the method
		System.out.println(proxy.add(5, 10));
		System.out.println("##################################");
		System.out.println(proxy.add(5, 10));
		System.out.println("##################################");
		System.out.println(proxy.add(5, 10));
		System.out.println("##################################");
		System.out.println(proxy.sub(10, 5));
		System.out.println("==========================");
		System.out.println(proxy.mul(10, 5));
		System.out.println("==========================");
		System.out.println(proxy.dev(100, 5));
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println(proxy.dev(100, 5));
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println(proxy.dev(100, 5));
		System.out.println("++++++++++++++++++++++++++++++++");
	}

}
