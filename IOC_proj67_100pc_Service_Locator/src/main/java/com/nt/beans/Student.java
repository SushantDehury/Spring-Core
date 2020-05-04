package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
	@Value("${stud.sno}")
	private int sno;
	@Value("${stud.name}")
	private String name;
	@Value("${stud.addrs}")
	private String adds;

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", adds=" + adds + "]";
	}

}
