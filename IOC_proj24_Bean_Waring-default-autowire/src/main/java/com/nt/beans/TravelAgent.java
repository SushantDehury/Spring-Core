package com.nt.beans;

public class TravelAgent {
	private TourPlan tplan;
	

	public TravelAgent(TourPlan tplan) {
		System.out.println("param constructor");
		this.tplan = tplan;
	}


	public void setTplan(TourPlan tplan) {
		this.tplan = tplan;
	}
	public TravelAgent() {
		System.out.println("0-param constructor");
	}
	
	@Override
	public String toString() {
		return "TravelAgent [tplan=" + tplan + "]";
	}

}
