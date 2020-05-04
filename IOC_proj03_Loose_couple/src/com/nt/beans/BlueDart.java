package com.nt.beans;

public class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart 0-param constructor");
	}

	@Override
	public String deliver(int deliverId) {
		return "deliverId " + deliverId + " is ready to deliver ";
	}

}
