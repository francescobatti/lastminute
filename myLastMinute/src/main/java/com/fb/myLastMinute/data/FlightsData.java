package com.fb.myLastMinute.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import com.fb.myLastMinute.been.Flight;

public class FlightsData {
	
	ArrayList<Flight> flights = new ArrayList<>();
	
	public FlightsData(){
		createFlights();
	}

	private void createFlights() {
		String csvFile = ".\\src\\main\\resources\\flights.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] split = line.split(cvsSplitBy);
                flights.add(new Flight(split[0],split[1],split[2],new Double(split[3])));
                
            }

        } catch (IOException e) {
        	System.out.println("FlightsData.createFlights() - ERROR file parser!");
            e.printStackTrace();
        }

    }

	public ArrayList<Flight> getFlights() {
		return flights;
	}
		

}
