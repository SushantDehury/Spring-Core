package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	private Date date;

	public WishGenerator(Date date) {
		System.out.println("Using parameterizrd constructor");
		this.date = date;
	}
	//Write b.logic
	public String generateWishMssg(String usre){
		int hour=0;
		hour=date.getHours();
		if (hour <= 12)
			return "::  good Morning  :: " + usre;
		else if (hour <= 20)
			return "::  good AfterNoon  :: " + usre;
		else
			return "::  good Night  :: " + usre;
	}
	
}
