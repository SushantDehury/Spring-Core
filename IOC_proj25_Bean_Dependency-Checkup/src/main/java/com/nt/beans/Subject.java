package com.nt.beans;

public class Subject {
	private String bookName;
	private String autherName;

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}

	@Override
	public String toString() {
		return "Subject [bookName=" + bookName + ", autherName=" + autherName + "]";
	}
	

}
