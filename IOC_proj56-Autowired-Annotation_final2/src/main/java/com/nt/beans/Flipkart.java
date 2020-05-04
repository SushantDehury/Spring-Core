package com.nt.beans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fkt")
public class Flipkart {
	@Autowired
	private DTDC dtdc;

	public String shooping(String items[]) {
		String status = null;
		int order = 0;
		order = new Random().nextInt(1000);
		status = dtdc.deliver(order);
		return status + " total price is " + items.length * 300;

	}

}
