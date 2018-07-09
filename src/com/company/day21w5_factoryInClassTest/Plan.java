package com.company.day21w5_factoryInClassTest;

public abstract class Plan {

	public double rate;
	
	public abstract void getRate();
	
	public void calculateBill(int units) {
		System.out.println(this.rate*units);
	}
	
}
