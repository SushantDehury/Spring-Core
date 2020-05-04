package com.nt.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.nt.aspect.PerformanceMoniAdcice;
import com.nt.pointcut.PerformanceMonitoringpointcut;
import com.nt.service.Calculator;

public class PerformanceTest {

	public static void main(String[] args) {
		ProxyFactory factory=null;
		Calculator cal,proxy=null;
		PerformanceMoniAdcice advice=null;
		DefaultPointcutAdvisor advisor=null;
		//create target class obj
		cal=new Calculator();
		//create aAdvice calss obj
		advice=new PerformanceMoniAdcice();
		//create ProxyFactory obj
		factory=new ProxyFactory();
		factory.setTarget(cal);
		//create Advisor class obj
		advisor=new DefaultPointcutAdvisor();
		advisor.setPointcut(new PerformanceMonitoringpointcut());
		advisor.setAdvice(advice);
		//add advisor in factory
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
		System.out.println("==========================");
	}

}
