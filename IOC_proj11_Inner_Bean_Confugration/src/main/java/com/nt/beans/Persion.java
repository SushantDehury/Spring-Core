package com.nt.beans;

public class Persion {
	private Passport passport=null;

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Persion [passport=" + passport + "]";
	}
	

}
