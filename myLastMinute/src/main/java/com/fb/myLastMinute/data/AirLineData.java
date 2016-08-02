package com.fb.myLastMinute.data;

import java.util.ArrayList;

import com.fb.myLastMinute.been.AirLine;

public class AirLineData {
	
	ArrayList<AirLine> airline = new ArrayList<>();
	
	public AirLineData(){
		createAirline();
	}

	private void createAirline() {
		airline.add(new AirLine ("IB","Iberia          ".trim(),10D  ));
		airline.add(new AirLine ("BA","British Airways ".trim(),15D  ));
		airline.add(new AirLine ("LH","Lufthansa       ".trim(),7D   ));
		airline.add(new AirLine ("FR","Ryanair         ".trim(),20D  ));
		airline.add(new AirLine ("VY","Vueling         ".trim(),10D  ));
		airline.add(new AirLine ("TK","Turkish Airlines".trim(),5D  ));
		airline.add(new AirLine ("U2","Easyjet         ".trim(), 19.90D));
		
	}

	public ArrayList<AirLine> getAirline() {
		return airline;
	}

}
