package com.fb.myLastMinute.controller;

import java.util.ArrayList;
import java.util.Date;
import com.fb.myLastMinute.been.AirLine;
import com.fb.myLastMinute.been.Airport;
import com.fb.myLastMinute.been.Flight;
import com.fb.myLastMinute.been.TravelSolution;
import com.fb.myLastMinute.data.AirLineData;
import com.fb.myLastMinute.data.AirportsData;
import com.fb.myLastMinute.data.FlightsData;
import com.fb.myLastMinute.util.DateUtil;

public class PriceCalculator {
	
	/**
	 * 
	 * @param adult
	 * @param child
	 * @param infant
	 * @param origin
	 * @param destination
	 * @param travelDate
	 * @return
	 */
	public ArrayList<TravelSolution> getSolutionsTravel(int adult, int child, int infant, String origin, String destination, Date travelDate){
		
		ArrayList<TravelSolution> solutions = new ArrayList<>();
		solutions = getSolutions(solutions,origin,destination);
		int perc = getPercent(travelDate);
		
		for (TravelSolution travelSolution : solutions) {
			travelSolution.setAdultPrice( adult * travelSolution.getTravelPrice() * perc / 100 ); 
			travelSolution.setChildPrice( child * (( travelSolution.getTravelPrice() * perc / 100) * 70 /100)); 
			travelSolution.setCompanyId(travelSolution.getIdFlight().substring(0, 2));
			travelSolution.setCompanyAirLine(getCompanyName(travelSolution.getCompanyId()));
			travelSolution.setInfantPrice( infant * getPriceInfant(travelSolution.getCompanyId()));
			travelSolution.setTotalPrice(travelSolution.getAdultPrice()+travelSolution.getChildPrice()+travelSolution.getInfantPrice());
		}
		
		return solutions;
	}
	
	private ArrayList<TravelSolution> getSolutions(ArrayList<TravelSolution> solutions, String origin, String destination) {
		
		ArrayList<Flight> flights = new FlightsData().getFlights();
		TravelSolution solution = null;
		for (Flight flight : flights) {
			if(origin.equalsIgnoreCase(flight.getOrigin()) && destination.equalsIgnoreCase(flight.getDestination())){
				solution = new TravelSolution();
				solution.setOrigin(origin + " - "+ getAiportName(origin));
				solution.setDestination(destination + " - "+ getAiportName(destination)); 
				solution.setIdFlight(flight.getAirlineCode());
				solution.setTravelPrice(flight.getPrice());
				solutions.add(solution);
			}
		}
		return solutions;
	}

	/**
	 * 
	 * @param origin
	 * @param destination
	 * @return
	 */
	private double getPriceInfant(String idFlight) {
		
		Double priceInf = null;
		ArrayList<AirLine> airlines = new AirLineData().getAirline();
				//System.out.println("PriceCalculator.getPriceInfant() IATACode = "+iataCode);
				for (AirLine airLine : airlines) {
					if(airLine.getIataAirLine().equalsIgnoreCase(idFlight)){
						priceInf = airLine.getPriceInfant();
					}
		}
		
		//System.out.println("PriceCalculator.getPriceInfant() - priceInf = " + priceInf + " €");
		return (priceInf == null ? 0 : priceInf) ;
	}

/**
 * 
 * @param idFlight
 * @return
 */
private String getCompanyName(String idFlight) {
		
		String compName = null;
		ArrayList<AirLine> airlines = new AirLineData().getAirline();
				//System.out.println("PriceCalculator.getPriceInfant() IATACode = "+iataCode);
				for (AirLine airLine : airlines) {
					if(airLine.getIataAirLine().equalsIgnoreCase(idFlight)){
						compName = airLine.getNameCom();
					}
		}
		
		//System.out.println("PriceCalculator.getPriceInfant() - priceInf = " + priceInf + " €");
		return (compName == null ? "" : compName) ;
	}

private String getAiportName(String aiportCode){
	String airportName = null;
	ArrayList<Airport> airlines = new AirportsData().getAirports();
	for (Airport airport : airlines) {
		if(airport.getIata().equalsIgnoreCase(aiportCode)){
			airportName = airport.getCity();
		}
	}
	return 	airportName;
}
	

	/**
	 * 
	 * @param travelDate
	 * @return
	 */
	private int getPercent(Date travelDate){
		
		int perc;
		DateUtil du = new DateUtil();
		
		long diff = du.getDifferenceFromDate(new Date(System.currentTimeMillis()), travelDate);
		if(diff > 30) {
			perc = 80;
		}else if (diff > 16){
			perc = 100;
		}else if (diff > 3){
			perc = 120;
		}else{
			perc = 150;
		}
		//System.out.println("PriceCalculator.getPercent() - percentage = " + perc + " %");
		return perc;
		
	}

}
