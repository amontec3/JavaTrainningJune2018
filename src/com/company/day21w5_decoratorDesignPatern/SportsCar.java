package com.company.day21w5_decoratorDesignPatern;

public class SportsCar implements Car{

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "A sports car";
	}

	@Override
	public double calculateCost() {
		// TODO Auto-generated method stub
		return 1000000;
	}

	
}
