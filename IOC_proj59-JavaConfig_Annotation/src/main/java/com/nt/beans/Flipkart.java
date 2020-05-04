package com.nt.beans;

import java.util.Random;

import javax.inject.Inject;
import javax.inject.Named;

@Named("fkt")
public class Flipkart {
	
	//@Inject
	private DTDC dtdc;
	
	/*@Inject
	public void setDtdc(DTDC dtdc) {
		this.dtdc = dtdc;
	}*/
	/*@Inject
	public void inject(DTDC dtdc) {
		this.dtdc=dtdc;
	}*/
	@Inject
	public Flipkart(DTDC dtdc) {
		this.dtdc=dtdc;
	}



	public String shooping(String items[]) {
		String status = null;
		int order = 0;
		order = new Random().nextInt(1000);
		status = dtdc.deliver(order);
		return status + " total price is " + items.length * 300;

	}

}
