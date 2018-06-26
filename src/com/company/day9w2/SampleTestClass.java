package com.company.day9w2;

public class SampleTestClass {
	int num;
	String str;
	boolean b1;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getOne();
		System.out.println(sumOfAll(6,89));
	}
	
	static void getOne() {
		System.out.println("Say Hello");
	}
	
	private static int sumOfAll(int a, int b) {
		int sum = a + b;
		return sum;
	}

}
