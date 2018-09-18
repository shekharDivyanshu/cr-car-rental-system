package com.cr.rental.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VehicleToBook {
	
	private String vehicleType;
	
	private String fromDate;
	
	private String fromTime;
	
	private String noOfDays;
	
	@JsonProperty(required=false)
	private String bookingReferenceNumber;

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getFromTime() {
		return fromTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(String noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getBookingReferenceNumber() {
		return bookingReferenceNumber;
	}

	public void setBookingReferenceNumber(String bookingReferenceNumber) {
		this.bookingReferenceNumber = bookingReferenceNumber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehicleToBook [vehicleType=");
		builder.append(vehicleType);
		builder.append(", fromDate=");
		builder.append(fromDate);
		builder.append(", fromTime=");
		builder.append(fromTime);
		builder.append(", noOfDays=");
		builder.append(noOfDays);
		builder.append(", bookingReferenceNumber=");
		builder.append(bookingReferenceNumber);
		builder.append("]");
		return builder.toString();
	}
	
}
