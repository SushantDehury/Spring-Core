package com.nt.beans;

public class VoterApp {
	private String name;
	private int age;

	public void setName(String name) {
		System.out.println("int setter NAME");
		this.name = name;
	}

	public void setAge(int age) {
		System.out.println("int setter AGE");
		this.age = age;
	}

	public VoterApp() {
		System.out.println("VoyerApp 0-param constructor");
	}

	public String voteElgible() {
		if (age >= 18)
			return name + " U r elgible for vottion process ";
		else
			return name + "  U r not elgible for voteing process";
	}

	public void myinit() {
		System.out.println("MyInit method");
		if (name == null || age <= 0)
			throw new IllegalArgumentException("Plz provide Valid input ");
	}

	public void mydestory() {
		System.out.println("MyDestory method");
		name = null;
		age = 0;
	}

}
