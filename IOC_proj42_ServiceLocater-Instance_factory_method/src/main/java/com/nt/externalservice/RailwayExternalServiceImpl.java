package com.nt.externalservice;

import java.nio.channels.IllegalSelectorException;

public class RailwayExternalServiceImpl implements RailwayExternalService {

	@Override
	public String getTrainShedule(int trainId) throws IllegalStateException {
		if(trainId==1001)
			return "NAGABALI  EXPRESS Dept.10:30 and Arrv.11:30";
		else if(trainId==1002)
			return"TATA YASBANTPUR EXPRESS Dept.13:30 and Arrv.12:30";
		else if(trainId==1003)
			return "FALAKNUMA EXPRESS Dept.08:00 and Arrv.09:30";
		else 
			 return "No match found";
	}

}
