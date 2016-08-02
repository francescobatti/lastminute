package com.fb.myLastMinute.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.fb.myLastMinute.util.DateUtil;

public class UtilTester {
	
	public static void main(String[] args) {
		try{
		DateUtil du = new DateUtil();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date firstDate = sdf.parse("21/09/2012");
		Date secondDate = sdf.parse("25/10/2013");
		System.out.println("Difference: "+du.getDifferenceFromDate(firstDate, secondDate) + " days");
		
		}catch (Exception e ){
			e.printStackTrace();
		}
		
	}

}
