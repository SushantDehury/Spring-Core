package com.nt.beans;

import java.util.Date;

public class Passport {
	private int passportNo;
	private String name;
	private String address;
	private Date dob;

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", name=" + name + ", address=" + address + ", dob=" + dob + "]";
	}

}
