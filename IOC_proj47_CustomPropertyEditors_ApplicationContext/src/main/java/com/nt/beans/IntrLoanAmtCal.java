package com.nt.beans;

public class IntrLoanAmtCal {
	private LoanDetails details;

	public void setDetails(LoanDetails details) {
		this.details = details;
	}
	public float simpleinteCal() {
		return (details.getpAmt()+details.getRate()+details.getTime())/100.0f;
	}
}
