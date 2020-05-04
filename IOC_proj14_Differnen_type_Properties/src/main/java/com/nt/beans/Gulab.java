package com.nt.beans;

import java.util.List;

public class Gulab {
	private List<String> colour;

	public void setColour(List<String> colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Gulab [colour=" + colour + "]";
	}

}
