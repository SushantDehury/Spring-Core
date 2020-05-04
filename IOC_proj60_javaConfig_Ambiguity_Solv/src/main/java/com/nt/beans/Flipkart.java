package com.nt.beans;

import java.util.Random;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Named("fkt")
public class Flipkart {
	
	@Inject()
	@Named("dtdc")
//	@Qualifier("dtdc")
	private Courior courior;

	public String shooping(String items[]) {
		String status = null;
		int order = 0;
		order = new Random().nextInt(1000);
		status = courior.deliver(order);
		return status + " total price is " + items.length * 300;

	}

}
