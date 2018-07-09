package com.company.day21w5_decoratorDesignPatern;

public class BumperSticker extends AccessoriesDecorator {

	private String color;

	public BumperSticker(Car car, String color) {
		this.car = car;
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return this.car.getDetails()+", bumperStickers with color = "+this.color;
	}

	@Override
	public double calculateCost() {
		// TODO Auto-generated method stub
		return this.car.calculateCost()+250;
	}

}
