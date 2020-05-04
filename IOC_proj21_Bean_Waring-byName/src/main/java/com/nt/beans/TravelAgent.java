package com.nt.beans;

public class TravelAgent {
	private TourPlan tplan;

	public void setTplan(TourPlan tplan) {
		this.tplan = tplan;
	}

	@Override
	public String toString() {
		return "TravelAgent [tplan=" + tplan + "]";
	}

}
