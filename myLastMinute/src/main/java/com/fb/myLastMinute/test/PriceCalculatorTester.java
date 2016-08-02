package com.fb.myLastMinute.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.fb.myLastMinute.been.TravelSolution;
import com.fb.myLastMinute.controller.PriceCalculator;

public class PriceCalculatorTester {
	
	public static void main(String[] args) {
		try{
			
			PriceCalculator pc = new PriceCalculator();
			int adult = 2;
			int child = 2;
			int infant = 1;
			String origin = "CPH";
			String destination = "FCO";
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date travelDate = sdf.parse("13/08/2016");
			ArrayList<TravelSolution> solutions = pc.getSolutionsTravel(adult, child, infant, origin, destination, travelDate);
			for (TravelSolution travelSolution : solutions) {
				System.out.println(travelSolution);
			}
		}catch(Exception e ){
			e.printStackTrace();
		}
		
		
	}

}
