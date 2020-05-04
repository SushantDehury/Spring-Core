package com.nt.target;

public class Calculator {

	public int add(int value1, int value2) {
		if (value1 == 0 || value2 == 0)
			throw new IllegalArgumentException("Provide valid input");
		return value1 + value2;
		
	}
}
