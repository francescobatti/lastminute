package com.fb.myLastMinute.been;

public class Flight {
	
	private String origin;
	private String destination;
	private String airlineCode;
	private String price;
	
	public Flight(String origin,String destination,String airlineCode,String price){
		
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
