package com.nt.beans;

import javax.inject.Named;

@Named("dtdc")
public class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC 0-param constructor");
	}

	@Override
	public String deliver(int deliverId) {

		return "deliverId " + deliverId + " is ready to deliver ";
	}

}
