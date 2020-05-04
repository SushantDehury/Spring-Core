package com.nt.beans;

import java.util.Random;

public class Flipkart {
	Courier courier=null;

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	public Flipkart() {
		System.out.println("Flipkart 0-parm constructor");
	}
	public String shooping(String items[]){
		String status=null;
		int order=0;
		order=new Random().nextInt(1000);
		status=courier.deliver(order);
		return status+" total price is "+items.length*300;
		
	}

}
