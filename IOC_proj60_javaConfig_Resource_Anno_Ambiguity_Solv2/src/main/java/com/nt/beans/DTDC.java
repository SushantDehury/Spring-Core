package com.nt.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Named("dtdc")
@Scope("prototype")
public class DTDC implements Courior{
	
	@Value("DTDC")
	private String name;
	public DTDC() {
		System.out.println("DTDC 0-param Constructor");
	}

	public String deliver(int deliverId) {

		return "###:"+name +":###"+ " deliverId " + deliverId + " is ready to deliver ";
	}

}
