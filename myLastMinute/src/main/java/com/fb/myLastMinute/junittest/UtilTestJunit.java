package com.fb.myLastMinute.junittest;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.fb.myLastMinute.util.DateUtil;


public class UtilTestJunit {
	
	 @Test
     public void dateDifference() {
            DateUtil tester = new DateUtil(); 
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date firstDate = null;
            Date secondDate = null;
            try{
            	firstDate = sdf.parse("01/09/2012");
            	secondDate = sdf.parse("11/09/2012");
     		}catch(Exception e){
     			e.printStackTrace();     			
     		}
     		// assert statements
            assertEquals("diff must be 10 days", 10, tester.getDifferenceFromDate(firstDate, secondDate));
     }

}
