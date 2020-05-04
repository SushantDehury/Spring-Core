package com.nt.target;

import java.util.Random;

public class PinGenerator {
	public int generatePin(int cardNo) {
		Random ram=new Random();
		int pin=0;
		//create one random pin
		pin=ram.nextInt(9999);

		return pin;
	}

}
