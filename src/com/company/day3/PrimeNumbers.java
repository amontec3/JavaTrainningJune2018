package com.company.day3;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int status =1;
		int num = 3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value:");
		n=scan.nextInt();
		scan.close();
		
		if(n>=1) { //input is greater than or equal to 1
			System.out.println("First "+ n + " prime numbers are :");
			System.out.println(2);
			
			for(int i =2;i<=n;) { //while i is less than or equal to input
				for(int j = 2; j<=Math.sqrt(num);j++) {//while j is less than or equal to sqrt of 3 
					System.out.println("num is : "+num);
					System.out.println("Square root of input is : "+Math.sqrt(num));
					if(num%j==0) {
						status=0;
						break;
					}
				}
				
				if(status !=0) {//prime number found, print to screen
					System.out.println(num);
					i++;
				}
				status = 1;
				num++;
			}
		}
		
	}//say input is 10 - >

}
