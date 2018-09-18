/**
 * 
 */
package com.cr.rental.vehicle;

import java.util.List;

/**
 * @author dshekhar
 *
 */
public interface RentalVehicle<T extends Vehicle<AvailableVehicleType>> {
	
	public T getVehicle();
	
	public List<VehicleSubType<T>> getVehicleSubType();

}
