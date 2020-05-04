package com.nt.externalservice;

public class ExternalServiceCompImpl implements ExternalServiceComp {

	@Override
	public String getScoure(int mid) throws Exception {
		if (mid == 1001)
			return "IND Vs SAF";
		else if (mid == 1001)
			return "IND Vs PAK";
		else
			throw new Exception();
	}

}
