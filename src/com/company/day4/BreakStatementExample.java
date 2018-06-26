package com.company.day4;

public class BreakStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		while (num <= 100) {
			System.out.println("Value of num: "+ num);
			if(num ==8) {
				break;
			}
			num++;
		}
		System.out.println("Out of While Loop");
	}

}
