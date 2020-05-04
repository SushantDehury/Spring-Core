package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class AdharCard {
	private int adharNo;
	private String name;
	private char gender;
	private Date dob;

	@Required
	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Required
	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "AdharCard [adharNo=" + adharNo + ", name=" + name + ", gender=" + gender + ", dob=" + dob + "]";
	}
	

}
