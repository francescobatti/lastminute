package com.fb.myLastMinute.been;

public class TravelSolution {
	
	//el object TravelSolution esta definito para contener cada dato de una soluzion de vuelo
	private String origin;
	private String destination;
	private String idFlight;
	private String companyAirLine;
	private String companyId;
	private Double travelPrice;
	private Double adultPrice;
	private Double childPrice;
	private Double infantPrice;
	private Double totalPrice;
	
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
	public String getIdFlight() {
		return idFlight;
	}
	public void setIdFlight(String idFlight) {
		this.idFlight = idFlight;
	}
	public String getCompanyAirLine() {
		return companyAirLine;
	}
	public void setCompanyAirLine(String companyAirLine) {
		this.companyAirLine = companyAirLine;
	}
	public Double getAdultPrice() {
		return adultPrice;
	}
	public void setAdultPrice(Double adultPrice) {
		this.adultPrice = adultPrice;
	}
	public Double getChildPrice() {
		return childPrice;
	}
	public void setChildPrice(Double childPrice) {
		this.childPrice = childPrice;
	}
	public Double getInfantPrice() {
		return infantPrice;
	}
	public void setInfantPrice(Double infantPrice) {
		this.infantPrice = infantPrice;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public Double getTravelPrice() {
		return travelPrice;
	}
	public void setTravelPrice(Double travelPrice) {
		this.travelPrice = travelPrice;
	}
	
	 public String toString() { 
         StringBuilder tsToString = new StringBuilder();
         tsToString.append("-----------------------------"+ "\n" );
         tsToString.append("ORIGIN: "+getOrigin()+ "\n" );
         tsToString.append("DESTINATION: "+ getDestination()+ "\n" );
         tsToString.append("IDFLIGHT: " +getIdFlight()+ "\n" );
         tsToString.append("COMPANY AIRLINE: " +getCompanyAirLine()+ "\n" );
         tsToString.append("COMPANY ID: "+ getCompanyId()+ "\n" );
         tsToString.append("TRAVEL PRICE: "+getTravelPrice()+ "\n" );
         tsToString.append("ADULT PRICE: "+getAdultPrice()+ "\n" );
         tsToString.append("CHILD PRICE: "+getChildPrice()+ "\n" );
         tsToString.append("INFANT PRICE: "+ getInfantPrice()+ "\n" );
         tsToString.append(""+ "\n" );
         tsToString.append(">>>TOTAL PRICE: "+ getTotalPrice()+ "\n" );
         tsToString.append("-----------------------------"+ "\n" );
         return tsToString.toString();
      } 

}
