package com.company.day6w2;

public class TryCatchNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method body.");

		try {
			System.out.println("Outer try Block.");
			int a=0;
			int b = 4/a;//arithmetic exception
			
			try {
				int [] array = {1,2,3,4,5};
				int c = array[8];// index error
				System.out.println("Middle try Block.");
				try {
					System.out.println("Inner most try Block.");
					int x = 0;
					int y = 4/x;//arithmetic error
					
				} catch (ArithmeticException e) {
					// TODO: handle exception
					System.out.println("Inner most try Block ERROR. Not divisible by zero.");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("Middle try Block ERROR. Index out of bounds.");
			}
		} catch (ArithmeticException e) {
			System.out.println("Outer try Block ERROR. Not divisible by zero.");
			// TODO: handle exception
		}
	}

}
