package com.company.day21w5;

public class BikeFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		return new Bike();
	}

	

}
