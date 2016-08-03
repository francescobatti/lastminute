package com.fb.myLastMinute.been;

public class Airport {
	//el object	Airport esta definido para contener los datos de los aereopuertos
	private String iata;
	private String city;
	
	public Airport(String iata, String city){
		this.iata= iata;
		this.city= city;
	}
	
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
