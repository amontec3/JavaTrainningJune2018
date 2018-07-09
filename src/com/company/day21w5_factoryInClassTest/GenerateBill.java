package com.company.day21w5_factoryInClassTest;

public class GenerateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetPlanFactory gpf = new GetPlanFactory();
		
		Plan ip = gpf.createPlan('I');
		Plan dp = gpf.createPlan('D');
		Plan cp = gpf.createPlan('C');

		ip.getRate();
		dp.getRate();
		cp.getRate();
		
		ip.calculateBill(50);
		dp.calculateBill(50);
		cp.calculateBill(50);
		
		
	}

}
