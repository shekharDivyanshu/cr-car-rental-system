package com.cr.rental.vehicle.car;

import com.cr.rental.vehicle.AvailableVehicleType;
import com.cr.rental.vehicle.Vehicle;

/**
 * Vehicle - CAR
 * 
 * @author dshekhar
 * @version 1.0
 * @since Sept 17, 2018
 *
 */
public class Car implements Vehicle<AvailableVehicleType>{
	
	/**
	 * {@inheritDoc}}
	 */
	@Override
	public AvailableVehicleType getVehicleType() {
		return AvailableVehicleType.CAR;
	}


}
