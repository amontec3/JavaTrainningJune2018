package com.company.day21w5_decoratorDesignPatern;

public class MusicSystem extends AccessoriesDecorator {
	public MusicSystem(Car car){
			this.car=car;
	}
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return this.car.getDetails() + ", MusicSystem = "+this.getMusicSystemDetails();
	}

	@Override
	public double calculateCost() {
		// TODO Auto-generated method stub
		return this.car.calculateCost();
	}

	public String getMusicSystemDetails() {
		return "Surround Sound System";
	}
}
