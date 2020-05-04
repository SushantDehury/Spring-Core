package com.nt.beans;

import java.util.Set;

public class Mobile {
	private Set<Integer> number;

	public void setNumber(Set<Integer> number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Mobile [number=" + number + "]";
	}

}
