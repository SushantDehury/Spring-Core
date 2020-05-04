package com.nt.beans;

import java.util.Properties;

public class Bike {

	private String Id;

	public void setId(String id) {
		Id = id;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}

	private String make;
	private String engineCC;

	@Override
	public String toString() {
		return "Bike [Id=" + Id + ", make=" + make + ", engineCC=" + engineCC + "]";
	}

}
