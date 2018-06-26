package com.company.day6w2;

public class TryCatchExample {

	//
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		
		try {
			num1 = 0;
			num2 = 34/num1;
			System.out.println(num2);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic error. Number not divisible by zero.");
			System.out.println(e.getMessage());
			// TODO: handle exception
			
		}
	}

}
