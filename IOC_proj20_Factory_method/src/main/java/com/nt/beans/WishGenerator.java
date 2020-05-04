package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	private Date dt;

	public void setDt(Date dt) {
		this.dt = dt;
	}
	public WishGenerator() {
		System.out.println("0-param constructor WishGT");
	}

	public String generateWishMssg(String name) {
		int hours = 0;
		hours = dt.getHours();
		if (hours > 12)
			return "Good morning " + name;

		else if (hours > 16)
			return "Good morning " + name;

		else if (hours > 19)
			return "Good Evening " + name;
		else
			return "Good night " + name;
	}
}
