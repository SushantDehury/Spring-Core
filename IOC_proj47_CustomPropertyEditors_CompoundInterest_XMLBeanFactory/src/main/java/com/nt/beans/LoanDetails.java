package com.nt.beans;

public class LoanDetails {
	private float pAmt;
	private float year;
	private float rate;
	
	public LoanDetails(float pAmt, float year, float rate) {
		this.pAmt = pAmt;
		this.year = year;
		this.rate = rate;
	}
	public float getpAmt() {
		return pAmt;
	}
	public float getYear() {
		return year;
	}
	public float getRate() {
		return rate;
	}
	
}

