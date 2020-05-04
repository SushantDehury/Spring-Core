package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("per")
public class Presion {
	@Value(value = "123456789")
	private int adhar;

	/* @Autowired(required=false) */
	@Autowired
	// @Qualifier("s1") / @Qualifier("s2")
	/* @Qualifier("stud") */
	private Student stu;

	public void setAdhar(int adhar) {
		this.adhar = adhar;
	}

	/*
	 * @Autowired public void setStu(Student stu) { this.stu = stu; }
	 */

	/*
	 * @Autowired public Presion(Student stu) { this.stu=stu; }
	 */

	/*
	 * @Autowired public void student(Student stu) { this.stu=stu; }
	 */

	@Override
	public String toString() {
		return "Presion [adhar=" + adhar + ", stu=" + stu + "]";
	}

}
