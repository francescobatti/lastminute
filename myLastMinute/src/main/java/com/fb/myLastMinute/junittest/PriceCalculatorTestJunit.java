package com.fb.myLastMinute.junittest;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import com.fb.myLastMinute.been.TravelSolution;
import com.fb.myLastMinute.controller.PriceCalculator;

public class PriceCalculatorTestJunit {
	
	@Test
	public void testPrice(){
		PriceCalculator pc = new PriceCalculator();
		int adult = 2;
		int child = 2;
		int infant = 1;
		String origin = "CPH";
		String destination = "FCO";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date travelDate = null;
		try {
			travelDate = sdf.parse("13/08/2016");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ArrayList<TravelSolution> solutions = pc.getSolutionsTravel(adult, child, infant, origin, destination, travelDate);
		assertEquals("must find 2 solutions travel", 2, solutions.size());
		int i = 1;
		for (TravelSolution travelSolution : solutions) {
			if( i == 1){
				assertEquals("travel1 CompanyAirLine must be Turkish Airlines", "Turkish Airlines", travelSolution.getCompanyAirLine());
				assertEquals("travel1 total price must be 563.96", new Double (563.96), travelSolution.getTotalPrice());
			}
			if(i == 2){
				assertEquals("travel2 CompanyAirLine must be Easyjet Airlines", "Easyjet", travelSolution.getCompanyAirLine());
				assertEquals("travel2 total price must be 1113.3400000000001",  new Double (1113.3400000000001) , travelSolution.getTotalPrice());
			}
			i++;
		}
	}

}
