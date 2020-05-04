package com.nt.beans;

public class ResultAdd {
	private Addition addition;

	public void setAddition(Addition addition) {
		this.addition = addition;
	}
	public int add() {
		return addition.getValue1()+addition.getValue2()+addition.getValue3();
	}
}
