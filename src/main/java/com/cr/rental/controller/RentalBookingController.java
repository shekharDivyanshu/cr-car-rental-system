/**
 * 
 */
package com.cr.rental.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cr.rental.booking.BookingDetail;
import com.cr.rental.pojo.BookCar;
import com.cr.rental.pojo.ResponseMessage;
import com.cr.rental.pojo.VehicleDetail;
import com.cr.rental.pojo.VehicleToBook;
import com.cr.rental.util.RentalCarValidator;
import com.cr.rental.util.RentalUtil;

/**
 * @author dshekhar
 *
 */
@RestController
public class RentalBookingController {
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value="/getAvailableCars", method=RequestMethod.GET, produces={"application/json"})
	public List<VehicleDetail> getAvailableVehicle() {
		return RentalUtil.getAvailableCars();
	}
	
	/**
	 * 
	 * @param carsToBook
	 * @return
	 */
	@RequestMapping(value="/book", method=RequestMethod.POST, consumes= {"application/json"}, produces={"application/json"})
	public ResponseMessage bookACar(@RequestBody BookCar carsToBook) {
		ResponseMessage respMessage = RentalCarValidator.validateInputCarDetails(carsToBook);
		if(!respMessage.isError()) {
			for(VehicleToBook vehicleToBook : carsToBook.getVehicleToBook()) {
				String referenceNumber = RentalUtil.bookCar(carsToBook.getCustomer(), vehicleToBook);
				if(null == referenceNumber) {
					vehicleToBook.setBookingReferenceNumber("null");
				}else {
					vehicleToBook.setBookingReferenceNumber(referenceNumber);
				}
			}
			respMessage.setData(carsToBook.getVehicleToBook());
		}
		
		return respMessage;
	}
	
	/**
	 * 
	 * @param bookingReferenceNumbers
	 * @return
	 */
	@RequestMapping(value="/getBookingDetail", method=RequestMethod.POST, produces={"application/json"})
	public Object getBookingByReferenceNumber(@RequestHeader("bookingReferenceNumbers") String bookingReferenceNumbers){
		List<BookingDetail>  bookingDetails = Collections.emptyList();
		if(null == bookingReferenceNumbers) {
			return bookingDetails;
		}
		bookingDetails = RentalUtil.getBookingByReferenceNumber(bookingReferenceNumbers);
		if(null == bookingDetails) {
			return bookingDetails;
		}
		
		return bookingDetails;
	}

}
