package com.nt.target;

import java.util.Calendar;

public class LoneAprove {
	public String aproveLone(int orderId,String name) {
		Calendar cal=null;
		int month=0;
		cal=Calendar.getInstance();
		month=cal.get(cal.MONDAY);
		if(month>=5 || month<= 7) {
			return name+"  your loan is approve based on your "+orderId;
		}else {
			return name+"  your loan is not approve based on your "+orderId;
		}
		
	}

}
