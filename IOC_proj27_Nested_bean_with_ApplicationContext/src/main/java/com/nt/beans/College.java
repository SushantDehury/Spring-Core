package com.nt.beans;

public class College {
	private String college;
	private Student std;

	public void setCollege(String college) {
		this.college = college;
	}


	public void setStd(Student std) {
		this.std = std;
	}


	@Override
	public String toString() {
		return "College [college=" + college + ", std=" + std + "]";
	}


	

}
