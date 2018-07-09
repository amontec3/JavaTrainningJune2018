package com.company.day21w5;

public class CarFactory extends VehicleFactory{

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}

}
