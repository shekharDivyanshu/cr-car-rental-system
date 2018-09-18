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
public class Van implements VehicleSubType<Car>{
	
	@Override
	public String getSubTypeName() {
		return Constants.VAN;
	}

	@Override
	public int getSubTypeVolume() {
		return Constants.VAN_VOLUME;
	}
}
