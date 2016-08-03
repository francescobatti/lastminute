package com.fb.myLastMinute.junittest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.fb.myLastMinute.been.Flight;
import com.fb.myLastMinute.data.FlightsData;


public class FlightsConstructorTestJunit {

	
	 @Test
     public void flightsNumberTest() {	
		 FlightsData fd = new FlightsData();
		 ArrayList<Flight> flights = fd.getFlights();
		 assertEquals("flights must be 89 days", 89, flights.size());
	 }
	   

}
