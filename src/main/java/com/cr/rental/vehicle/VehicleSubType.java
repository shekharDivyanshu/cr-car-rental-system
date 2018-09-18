package com.cr.rental.vehicle;

public interface VehicleSubType<T extends Vehicle<AvailableVehicleType>> {
	
	public String getSubTypeName();
	
	public int getSubTypeVolume();

}
