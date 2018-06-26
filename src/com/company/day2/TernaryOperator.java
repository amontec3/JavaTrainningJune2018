package com.company.day2;

import java.util.Scanner;

public class TernaryOperator {
	//var num = (expression) ? value if true : value if false; <----ternary operator returns value not true or false
	public static void main(String [] args){
//		int num1;
//		int num2;
//		
//		num1 =25;
//		
//		num2 = (num1 == 10)? 100:200;
//		System.out.println(num2);
		
		//num2 = (num1 == 10)? 100:200;
		//System.out.println((num1 == 10)? 100:200);
		int a, b, c, largest;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first value: ");
		a=scan.nextInt();
		System.out.println("Enter second value: ");
		b=scan.nextInt();
		System.out.println("Enter third value: ");
		c=scan.nextInt();
		scan.close();
		
		//compare a and b for largest
		largest = (a>b)?a:b;
		//compare result with c for largest
		largest = (largest>c)?largest:c;
		
		System.out.println("Largest value is: "+largest);
	}
}
