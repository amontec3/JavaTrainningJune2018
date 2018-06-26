package com.company.day3;

import java.util.Scanner;

public class ForLoopForArray {
	//FIBONACCI SEQUENCE FOR THE FIRST N NUMBERS IN THE SEQUENCE
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] n = {23,34,45};
//		String [] str = {"Test", "Test1","Test2"};
//		System.out.println(str[2]);
//		str[2]="yolo";
//		System.out.println(str[2]);
		
		//for loop
//		int []arr= {2,11,45,9};
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		//enhanced for loop
//		for(int num: arr) {
//			System.out.println(num);
//		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n =scan.nextInt();
		scan.close();
		int prev = 0;
		int current = 1;
		int next;
		
		System.out.println("First " + n +" numbers in fibonacci sequence are: " );
		
		System.out.print(prev);//0
		System.out.print(", "+current);//1

		for(int i = 0; i<n-2;i++) {
			next = current +prev;//1
			System.out.print(", "+next);
			prev=current;
			current=next;
		}
	}
	

}
