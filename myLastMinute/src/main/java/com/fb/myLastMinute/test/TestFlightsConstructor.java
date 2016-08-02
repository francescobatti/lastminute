package com.fb.myLastMinute.test;

import java.util.ArrayList;

import com.fb.myLastMinute.been.Flight;
import com.fb.myLastMinute.data.FlightsData;

public class TestFlightsConstructor {
	
	public static void main(String[] args) {
		
		FlightsData fd = new FlightsData();
		ArrayList<Flight> flights = fd.getFlights();
		for (Flight flight : flights) {
			System.out.println("Flights details: "+flight.getAirlineCode() + " - " +flight.getOrigin() + " - " + flight.getDestination()  + " - " + flight.getPrice() + "€" );
		}
		
	}

}
