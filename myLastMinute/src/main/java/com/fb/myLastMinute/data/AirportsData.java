package com.fb.myLastMinute.data;

import java.util.ArrayList;

import com.fb.myLastMinute.been.Airport;

public class AirportsData {
	
	private ArrayList<Airport> airports = new ArrayList<>();
	
	public AirportsData() {
		createAirport();
	}

	private void createAirport() {
		airports.add(new Airport("MAD" ,"Madrid"));
		airports.add(new Airport("BCN" ,"Barcelona"));
		airports.add(new Airport("LHR" ,"London"));
		airports.add(new Airport("CDG" ,"Paris"));
		airports.add(new Airport("FRA" ,"Frakfurt"));
		airports.add(new Airport("IST" ,"Istanbul"));
		airports.add(new Airport("AMS" ,"Amsterdam"));
		airports.add(new Airport("FCO" ,"Rome"));
		airports.add(new Airport("CPH" ,"Copenhagen"));
	}

	public ArrayList<Airport> getAirports() {
		return airports;
	}


}
