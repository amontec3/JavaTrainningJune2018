package com.company.day6w2;

public class SampleThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		eligibility(14,45);
		
	}
	
	static void eligibility(int empId, int num) throws ArithmeticException{
		
		if(empId <24 && num<55) {
			throw new ArithmeticException("Not eligible for bonus");
		}
		else {
			System.out.println("Eligible for bonus");
		}
	}

}
