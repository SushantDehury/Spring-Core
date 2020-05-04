package com.nt.beans;

public class Student {
	private int sno;
	private String sname;
	private Address add;

	public void setAdd(Address add) {
		this.add = add;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", add=" + add + "]";
	}

}
