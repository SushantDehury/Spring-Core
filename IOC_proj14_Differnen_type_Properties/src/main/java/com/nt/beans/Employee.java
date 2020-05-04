package com.nt.beans;

import java.util.Properties;

public class Employee {
	private Properties empComp;

	public void setEmpComp(Properties empComp) {
		this.empComp = empComp;
	}

	@Override
	public String toString() {
		return "Employee [empComp=" + empComp + "]";
	}

}
