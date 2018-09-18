/**
 * 
 */
package com.cr.rental.vehicle;

import java.util.ArrayList;
import java.util.List;

import com.cr.rental.vehicle.car.Car;
import com.cr.rental.vehicle.car.subtype.Sedan;
import com.cr.rental.vehicle.car.subtype.Suv;
import com.cr.rental.vehicle.car.subtype.Van;



/**
 * @author dshekhar
 *
 */
public class RentalCar implements RentalVehicle<Car> {
	
	@Override
	public Car getVehicle() {
		Car car = new Car();
		return car;
	}

	@Override
	public List<VehicleSubType<Car>> getVehicleSubType() {
		List<VehicleSubType<Car>> subTypeList = new ArrayList<>();
		Sedan sedan = new Sedan();
		Suv suv = new Suv();
		Van van = new Van();
		subTypeList.add(sedan);
		subTypeList.add(suv);
		subTypeList.add(van);
		return subTypeList;
	}
	
}
