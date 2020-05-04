package com.nt.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoterApp implements InitializingBean,DisposableBean{
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

	

	public void destroy() throws Exception {
		System.out.println("Destory");
		name = null;
		age = 0;

		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertyset");
		if (name == null || age <= 0)
			throw new IllegalArgumentException("Plz provide Valid input ");
	}

}
