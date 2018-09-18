package com.cr.rental.vehicle;

/**
 * 
 * @author dshekhar
 * @version 1.0
 * @since Sept 17, 2018
 *
 * @param <T>
 */
public interface Vehicle<T extends Enum<AvailableVehicleType>> {
	
	/**
	 * get vehicle type
	 * @return <code>AvailableVehicleType</code> vehicleType
	 */
	public T getVehicleType();

}
