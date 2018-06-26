package com.company.day6w2;

public class TryWithFinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int number = 234/0;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Number cannot be divided by zero.");
		} finally {
			System.out.println("End of block.");
		}
		System.out.println(tryFinally());
		
	}
	
	
	public static int tryFinally() {
		try {
			return 234;
		} finally {
			// TODO: handle finally clause
			System.out.println("Method Return some numbers");
		}
	}

}
