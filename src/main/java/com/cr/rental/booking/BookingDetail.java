/**
 * 
 */
package com.cr.rental.booking;

import java.time.LocalDateTime;

import com.cr.rental.customer.Customer;



/**
 * @author dshekhar
 * @version 1.0
 * @since Sept 17, 2018
 *
 */
public class BookingDetail {
	
	private Customer customer;
	private String vehicleType;
	private String vehicleSubType;
	private LocalDateTime startDateTime;
	private LocalDateTime endDateTime;
	private String bookingReferenceNumber;
	
	public BookingDetail(Customer customer,String vehicleType, String vehicleSubType, LocalDateTime startDateTime,
			LocalDateTime endDateTime, String bookingReferenceNumber) {
		this.customer = customer;
		this.vehicleType = vehicleType;
		this.vehicleSubType = vehicleSubType;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.bookingReferenceNumber = bookingReferenceNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleSubType() {
		return vehicleSubType;
	}

	public void setVehicleSubType(String vehicleSubType) {
		this.vehicleSubType = vehicleSubType;
	}

	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}

	public LocalDateTime getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
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
		builder.append("BookingDetail [customer=");
		builder.append(customer);
		builder.append(", vehicleType=");
		builder.append(vehicleType);
		builder.append(", vehicleSubType=");
		builder.append(vehicleSubType);
		builder.append(", startDateTime=");
		builder.append(startDateTime);
		builder.append(", endDateTime=");
		builder.append(endDateTime);
		builder.append(", bookingReferenceNumber=");
		builder.append(bookingReferenceNumber);
		builder.append("]");
		return builder.toString();
	}
	
}
