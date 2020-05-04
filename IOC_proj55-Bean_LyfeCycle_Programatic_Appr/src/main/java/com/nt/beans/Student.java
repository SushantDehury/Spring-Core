package com.nt.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean{
	private int sno;
	private String name;
	private String addrs;

	public Student() {
		System.out.println("Student calss 0-param Constructor");
	}

	public void setSno(int sno) {
		System.out.println("set sno...");
		this.sno = sno;
	}

	public void setName(String name) {
		System.out.println("set name...");
		this.name = name;
	}

	public void setAddrs(String addrs) {
		System.out.println("set Address...");
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", addrs=" + addrs + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertySet()");
		if (sno>200 || sno<100) {
			throw new IllegalArgumentException("Student number must between 100 to 200");
		}
		
	}

}
