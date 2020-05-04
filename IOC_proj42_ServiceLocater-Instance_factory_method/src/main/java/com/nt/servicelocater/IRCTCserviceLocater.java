package com.nt.servicelocater;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.nt.externalservice.RailwayExternalService;
import com.nt.externalservice.RailwayExternalServiceImpl;

public class IRCTCserviceLocater {
	


		private Map<String,RailwayExternalService> cache=new HashMap();

	public  RailwayExternalService getResultTrain(String jndiName){
		RailwayExternalService extservice=null;
		if(!cache.containsKey(jndiName)) {
			extservice=new RailwayExternalServiceImpl();
			cache.put(jndiName, extservice);
		}
		return cache.get(jndiName);
	}

}
