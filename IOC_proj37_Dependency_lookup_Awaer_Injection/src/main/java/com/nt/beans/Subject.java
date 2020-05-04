package com.nt.beans;

public class Subject {
	private String bookName;
	private int totalBook;
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setTotalBook(int totalBook) {
		this.totalBook = totalBook;
	}
	public Subject() {
		System.out.println("Subject class 0-param Constructor");
	}
	public String subjectDetails() {
		return "Subject is "+bookName+" & number of book is "+totalBook+" . . .";
	}

}
