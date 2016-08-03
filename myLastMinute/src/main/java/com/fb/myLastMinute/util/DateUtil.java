package com.fb.myLastMinute.util;

import java.util.Date;


public class DateUtil {
	
	/**
	 * 
	 * @param firstDate
	 * @param secondDate
	 * @return
	 */
	public long getDifferenceFromDate(Date firstDate, Date secondDate){
		
		long difDays = 0;
		long diff = secondDate.getTime() - firstDate.getTime();
		difDays = diff / 1000 / 60 / 60 / 24 ;
		//System.out.println("DateUtil.getDifferenceFromDate() difDays = "+difDays);
		return difDays;
		
	}

}
