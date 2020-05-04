package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	private Date date;

	public void setDate(Date date) {
		System.out.println("Data calss");
		this.date = date;
	}
	public WishGenerator() {
		System.out.println("WishGeneratoe 0-param coms");
	}

	public String generateWishMssg(String name) {
		int hour = 0;
		hour = date.getHours();
		if (hour <= 12)
			return "::  good Morning  :: " + name;
		else if (hour <= 20)
			return "::  good AfterNoon  :: " + name;
		else
			return "::  good Night  :: " + name;
	}

}
