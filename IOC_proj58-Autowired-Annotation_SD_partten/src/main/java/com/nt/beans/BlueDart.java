package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("bdart")
public class BlueDart implements Courior {
	@Value("BlueDart")
	private String name;
	
	public String deliver(int deliverId) {

		return "###:"+name+":###" + " deliverId " + deliverId + " is ready to deliver ";
	}

}
