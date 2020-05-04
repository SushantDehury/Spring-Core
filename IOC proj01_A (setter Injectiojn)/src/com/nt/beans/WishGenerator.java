package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	private Date date;
	

	public WishGenerator(Date date) {
		System.out.println("Throw Constructor Injection");
		this.date = date;
	}

	public void setDate(Date date) {
		System.out.println("Throw setter Injection");
		this.date = date;
	}

	public String generateWishMssg(String name) {
		int hour = 0;
		hour = date.getHours();
		System.out.println(date);
		if (hour <= 12)
			return "::  good Morning  :: " + name;
		else if (hour <= 20)
			return "::  good AfterNoon  :: " + name;
		else
			return "::  good Night  :: " + name;
	}

}
