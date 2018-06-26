package com.company.day2;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * a) if statement
		 * b) nested if statement
		 * c) if-else statement
		 * d) if-else-if statement
		 * */
		//if statement
//		int num =70;
//		if (num <100) {
//			System.out.println("Number is less than 100");
//		}
//		
//		//Nested if statements
//		
//		if(num <100) {
//			System.out.println("Number is less than 100");
//			if(num > 50){
//				System.out.println("Number is greater than 50");
//			}
//		}
//		
//		// if else statements
//		if(num <100) {
//			System.out.println("Number is less than 100");
//		}else {
//			System.out.println("Number is not less than 100");
//		}
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value: ");
		num2 = scan.nextInt();
		scan.close();
		if(num2>0) {
			if(num2%2==0) {
				System.out.println("Number is positive and even");
			}
			else {
				System.out.println("Number is positive and odd");
			}
		}else if(num2<0) {
			if(num2%2==0) {
				System.out.println("Number is negative and even");
			}
			else {
				System.out.println("Number is negative and odd");
			}
		}
		else {
			System.out.println("Number is neither positive or negative but is even");
		}
		
//		if(num2%2==0) {
//			System.out.println("Number is even");
//		}
//		else {
//			System.out.println("Number is odd");
//		}
		
		
		/*if num is odd, print weird
		* If num is even and in the inclusive range of 2 to 5, print not Weird
		*
		* if num is even and in the inclusive range of 6 to 20 , print weird
		* if num is even and greater than 20, print not weird
		in range of 1 to 100
		*/
		
		
		
		
	}

	
}
