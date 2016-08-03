package com.fb.myLastMinute.been;

public class Flight {
	
	private String origin;
	private String destination;
	private String airlineCode;
	private Double price;
	
	
	public Flight(String origin,String destination,String airlineCode,Double price){
	//el object	Flight esta definido para contener los datos de los vuelos
		this.origin=origin;
		this.destination=destination;
		this.airlineCode= airlineCode;
		this.price=price;
		
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getAirlineCode() {
		return airlineCode;
	}
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
