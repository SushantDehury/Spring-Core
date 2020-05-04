package com.nt.beans;

import java.beans.ConstructorProperties;
import java.util.Arrays;

public class Student {
	private String studentNames[];

	public Student(String[] studentNames) {
		this.studentNames = studentNames;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + Arrays.toString(studentNames) + "]";
	}

}
