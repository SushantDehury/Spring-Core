package com.nt.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Named("bdart")
@Scope("singleton")
public class BlueDart implements Courior {
	
	@Value("BlueDart")
	private String name;
	public BlueDart() {
		System.out.println("BlueDart 0-param Constructor");
	}
	
	public String deliver(int deliverId) {

		return "###:"+name+":###" + " deliverId " + deliverId + " is ready to deliver ";
	}

}
