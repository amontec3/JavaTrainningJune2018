package com.company.day4;

import java.util.Scanner;

public class MethodWithParam {
	//class methods
	public static void getOne() {
		System.out.println("method test");
	}
	
	public static int getSum(int a) { //prints sum of numbers from 0 to a
		int sum=0;
		for(int i = 1;i<=a;i++) {
			sum+=i;
		}
		return sum;
	}
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MethodWithParam.getOne();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value: ");
		int input = scan.nextInt();
		scan.close();
		System.out.println("Sum of all numbers from 0 to "+input+" is : "+MethodWithParam.getSum(input));
	}

}
