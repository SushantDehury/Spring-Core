package com.nt.beans;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;

@Named("dtdc")
public class DTDC implements Courior{
	
	@Value(value = "DTDC")
	private String name;

	public String deliver(int deliverId) {

		return "###:"+name +":###"+ " deliverId " + deliverId + " is ready to deliver ";
	}

}
