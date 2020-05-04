package com.nt.servicelocater;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.nt.externalservice.RailwayExternalService;
import com.nt.externalservice.RailwayExternalServiceImpl;

public class IRCTCserviceLocater implements FactoryBean<RailwayExternalService>{

		private String jndiName;
		private Map<String,RailwayExternalService> cache=new HashMap();
	public void setJndiName(String jndiName) {
			this.jndiName = jndiName;
		}

	@Override
	public RailwayExternalService getObject() throws Exception {
		RailwayExternalService extservice=null;
		if(!cache.containsKey(jndiName)) {
			extservice=new RailwayExternalServiceImpl();
			cache.put(jndiName, extservice);
		}
		return cache.get(jndiName);
	}

	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return RailwayExternalService.class;
	}
	@Override
	public boolean isSingleton() {
		return true;
	}

}
