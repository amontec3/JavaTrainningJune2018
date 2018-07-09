package com.company.day21w5;

public abstract class VehicleFactory {

	Vehicle vehicle;
	public Vehicle assembleVehicle() {
		System.out.println("Starting to build vehicle");
		this.vehicle = createVehicle();
		System.out.println("Mounting vehicle parts");
		return this.vehicle;
	}
	public abstract Vehicle createVehicle();
	
	
}
