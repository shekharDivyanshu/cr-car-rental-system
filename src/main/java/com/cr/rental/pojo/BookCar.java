/**
 * 
 */
package com.cr.rental.pojo;

import java.util.List;

import com.cr.rental.customer.Customer;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author dshekhar
 *
 */
public class BookCar {
	
	@JsonProperty("customer")
	private Customer customer;
	
	@JsonProperty("vehicle")
	private List<VehicleToBook> VehicleToBook;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<VehicleToBook> getVehicleToBook() {
		return VehicleToBook;
	}

	public void setVehicleToBook(List<VehicleToBook> vehicleToBook) {
		VehicleToBook = vehicleToBook;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookCar [customer=");
		builder.append(customer);
		builder.append(", VehicleToBook=");
		builder.append(VehicleToBook);
		builder.append("]");
		return builder.toString();
	}
	
}
