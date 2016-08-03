package com.fb.myLastMinute.been;

public class AirLine {
	//el object	AirLine esta definido para contener los datos de las empresa de vuelo
	
	
	private String iataAirLine;
	private String nameCom;
	private Double priceInfant;
	
	public AirLine(String iataInfant,String nameCom,Double price){
		this.iataAirLine = iataInfant;
		this.nameCom = nameCom;
		this.priceInfant = price;
	}
	
	
	public String getNameCom() {
		return nameCom;
	}
	
	public void setNameCom(String nameCom) {
		this.nameCom = nameCom;
	}
	
	public String getIataAirLine() {
		return iataAirLine;
	}


	public void setIataAirLine(String iataAirLine) {
		this.iataAirLine = iataAirLine;
	}


	public Double getPriceInfant() {
		return priceInfant;
	}


	public void setPriceInfant(Double priceInfant) {
		this.priceInfant = priceInfant;
	}
	

}
