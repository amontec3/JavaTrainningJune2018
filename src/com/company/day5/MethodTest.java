package com.company.day5;

public class MethodTest {
	//METHOD SIGNATURE / SIGNATURE OF METHOD = method name and parameters
	
	public static int getSumOfAmount(int a, int b) {
		return a+b;
	}
	
	
	public static int getSum(int a, int b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5.99+4);
		System.out.println((int)(5.99+4));
		System.out.println(getSumOfAmount(2,2));
		System.out.println(getSum(2,getSumOfAmount(2,2)));

	}

}
