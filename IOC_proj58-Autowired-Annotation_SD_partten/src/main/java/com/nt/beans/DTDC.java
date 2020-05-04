package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dtdc")
//@Primary
public class DTDC implements Courior{
	
	@Value(value = "DTDC")
	private String name;

	public String deliver(int deliverId) {

		return "###:"+name +":###"+ " deliverId " + deliverId + " is ready to deliver ";
	}

}
