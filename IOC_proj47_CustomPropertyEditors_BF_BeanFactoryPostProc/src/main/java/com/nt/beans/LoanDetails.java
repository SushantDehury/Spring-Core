package com.nt.beans;

public class LoanDetails {
	private float pAmt;
	private float time;
	private float rate;

	public LoanDetails(float pAmt, float time, float rate) {
		this.pAmt = pAmt;
		this.time = time;
		this.rate = rate;
	}

	public float getpAmt() {
		return pAmt;
	}

	public float getTime() {
		return time;
	}

	public float getRate() {
		return rate;
	}

}
