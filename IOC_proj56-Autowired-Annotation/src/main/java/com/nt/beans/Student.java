package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value(value = "Suahant")
	private String name;
	@Value(value = "HYD..")
	private String adds;

	public void setName(String name) {
		this.name = name;
	}

	public void setAdds(String adds) {
		this.adds = adds;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", adds=" + adds + "]";
	}

}
