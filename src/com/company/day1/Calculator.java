package com.company.day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first Value: ");
		double a = scan.nextDouble();
		System.out.println("Enter second Value: ");
		double b = scan.nextDouble();
		System.out.println("Enter operation you would like to perform (Example +, - , *, /): ");
		String s = scan.next();
		scan.close();
		double ans;
		
		if(s.equals("+")){
			ans = a+b;
		}
		else if(s.equals("-")){
			ans = a-b;
		}
		else if(s.equals("*")){
			ans = a*b;
		}
		else if(s.equals("/")){
			ans = a/b;
		}
		else{
			System.out.println("Invalid Operation");
			ans = 0;
			System.exit(0);
		}
		System.out.printf("%.3f %s %.3f = %.3f",a,s,b,ans);




	}

}
