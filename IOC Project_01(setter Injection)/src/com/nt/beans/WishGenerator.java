package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	//bean properties
	private String name;
	private Date date;
	//Getter method for setter injection
	public void setName(String name){
		this.name=name;
	}
	public void setDate(Date date){
		this.date=date;
	}
	//b.logic
	public String generatorWishMsg(){
		return "GoodMorning  "+name+"  -------->  "+date;
	}
}
