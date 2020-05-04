package com.nt.beans;

public class Teacher {
	private String tname;
	private String mail;
	private Subject sub;

	public void setTname(String tname) {
		this.tname = tname;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Teacher [tname=" + tname + ", mail=" + mail + ", sub=" + sub + "]";
	}
	

}
