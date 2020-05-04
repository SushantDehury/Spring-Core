package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("msg")
public class WishGenerator {

	@Autowired
	private Calendar cal;

	public WishGenerator() {
		System.out.println("WishGenerator 0-param Constructor");
	}

	public String generateWishMsg(String name) {
		int hour = 0;
		// get hour of the day
		hour = cal.HOUR_OF_DAY;
		if (hour < 12)
			return "Good Morning " + name;
		else if (hour < 16)
			return "Good Afternoon " + name;
		else if (hour < 20)
			return "Good Evening " + name;
		else
			return "Good Night " + name;
	}

}
