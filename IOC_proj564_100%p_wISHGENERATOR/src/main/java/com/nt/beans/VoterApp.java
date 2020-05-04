package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class VoterApp {
	private int id;
	private String name;
	private String add;
	private Date dob;

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Required
	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "VoterApp [id=" + id + ", name=" + name + ", add=" + add + ", dob=" + dob + "]";
	}

}
