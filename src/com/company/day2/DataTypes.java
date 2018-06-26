package com.company.day2;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//java Operators
		/*
		 * 1. Basic arithmetic
		 * 2. Assignment
		 * 3. Auto-increment
		 * 4. Logical
		 * 5. Comparison
		 * 6. Ternary
		 * */
		
		// 1. basic arithmetic
		// +, -, /, *, %
		
//		int num1 = 100;
//		int num2 = 20;
//		
//		System.out.println("Num 1 + Num2: " + (num1+num2));
//		System.out.println("Num 1 - Num2: " + (num1-num2));
//		System.out.println("Num 1 * Num2: " + (num1*num2));
//		System.out.println("Num 1 / Num2: " + (num1/num2));
//		System.out.println("Num 1 % Num2: " + (num1%num2));
//		
//		//Assignment Variables
//		// =, +=, -=, *=, /= and %/
//		
//		num2 = num1;
//		System.out.println(num2);
//		
//		num2 += num1; //num2=num2+num1
//		System.out.println(num2);
//
//		num2 -= num1;
//		System.out.println(num2);
//
//		num2 *= num1;
//		System.out.println(num2);
//
//		num2 /= num1;
//		System.out.println(num2);
//
//		num2 %= num1;
//		System.out.println(num2);

		//Auto Increment  ++ , --  
		int number =1;
		number++;
		System.out.println(number++); //increments after printing
		System.out.println(++number); //increments before printing
		
		//Logical ooperators
		// &&, || , !
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!(b1 && b2));
		

	}

}
