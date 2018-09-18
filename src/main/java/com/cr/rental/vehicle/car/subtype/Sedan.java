/**
 * 
 */
package com.cr.rental.vehicle.car.subtype;

import com.cr.rental.constants.Constants;
import com.cr.rental.vehicle.VehicleSubType;
import com.cr.rental.vehicle.car.Car;

/**
 * @author dshekhar
 *
 */
public class Sedan implements VehicleSubType<Car>{

	@Override
	public String getSubTypeName() {
		return Constants.SEDAN;
	}

	@Override
	public int getSubTypeVolume() {
		return Constants.SEDAN_VOLUME;
	}

}
