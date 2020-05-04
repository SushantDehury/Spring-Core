package com.nt.editors;

import java.beans.PropertyEditorSupport;

import com.nt.beans.LoanDetails;

public class CustomIntrLoanAmtcal extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		float pAmt = Float.parseFloat(text.substring(0, text.indexOf(",")));
		float time = Float.parseFloat(text.substring(text.indexOf(",") + 1, text.lastIndexOf(",")));
		float rate = Float.parseFloat(text.substring(text.lastIndexOf(",") + 1, text.length()));
		LoanDetails details = new LoanDetails(pAmt, time, rate);
		setValue(details);
	}

}
