package com.nt.beans;

public class Student {
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

	public void myInit() {
		System.out.println("Custom myInit()");
		if (sno < 100 || sno > 200) {
			throw new IllegalArgumentException("Student no must between 100 to 200");
		}
	}

	public void myDestory() {
		System.out.println("Custom myDestory()");
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", addrs=" + addrs + "]";
	}

}
