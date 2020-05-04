package com.nt.beans;

import java.util.List;

public class Bike {

	private List<String> color;

	public void setColor(List<String> color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Bike [color=" + color + "]";
	}
	
}
