package com.nt.service;

import com.nt.externalservice.RailwayExternalService;
import com.nt.servicelocater.IRCTCserviceLocater;

public class IRCTCLocalServieImpl implements IRCTCLocalService {
	private RailwayExternalService extservice;

	public void setExtservice(RailwayExternalService extservice) {
		this.extservice = extservice;
	}

	@Override
	public String serchTrainShedule(int trainId) throws Exception {
		String result = null;
		result = extservice.getTrainShedule(trainId);

		return result;
	}

}
