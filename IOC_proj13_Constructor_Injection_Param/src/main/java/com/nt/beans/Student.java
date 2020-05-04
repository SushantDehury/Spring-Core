package com.nt.beans;

import java.beans.ConstructorProperties;

public class Student {
	private int sno;
	private String sname;
	private float salary;
	
	public Student(int sno, String sname, float salary) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", salary=" + salary + "]";
	}

}
