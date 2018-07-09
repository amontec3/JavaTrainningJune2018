package com.company.day21w5;

public class Dealer {

	public static void main(String[] args) {
		VehicleFactory bikeFactory = new BikeFactory();
		VehicleFactory carFactory = new CarFactory();

		Vehicle bike = bikeFactory.createVehicle();
		Vehicle car = carFactory.createVehicle();
		
		if(bike instanceof Bike) {
			System.out.println("Bike object retrieved");
		}
		
		if (car instanceof Car) {
			System.out.println("Car object retrieved");
		}
	}

}
