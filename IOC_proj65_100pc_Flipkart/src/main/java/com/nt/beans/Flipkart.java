package com.nt.beans;

import java.util.Random;

import javax.inject.Inject;
import javax.inject.Named;

@Named("fkt")
public class Flipkart {
	@Inject
	@Named("dtdc")
	private Courier courier=null;

	public Flipkart() {
		System.out.println("Flipkart 0-parm constructor");
	}
	public String shooping(String items[]){
		String status=null;
		int order=0;
		order=new Random().nextInt(1000);
		status=courier.deliver(order);
		System.out.println(courier.getClass());
		return status+" total price is "+items.length*300;
		
	}

}
