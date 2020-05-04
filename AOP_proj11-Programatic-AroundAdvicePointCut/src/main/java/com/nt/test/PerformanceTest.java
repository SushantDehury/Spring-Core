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
	//	factory.addAdvice(new CacheAdvice());
		//create Advisor class obj
		advisor=new DefaultPointcutAdvisor();
/*		advisor.setPointcut(new PerformanceMonitoringpointcut());
		advisor.setAdvice(padvice);
*/
		NameMatchMethodPointcut point=new NameMatchMethodPointcut();
		point.addMethodName("add");
		point.addMethodName("dev");
		advisor.setPointcut(point);
		advisor.setPointcut(new PerformanceMonitoringpointcut());
		
		advisor.setAdvice(new CacheAdvice());
		advisor.setAdvice(padvice);
		factory.addAdvisor(advisor);
		//add advisor in factory
//		factory.addAdvisor(advisor);
		
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
