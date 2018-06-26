package com.company.day4;

public class ContinueStatement {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//continue;
		
		for(int j = 0 ; j<=6 ; j++) {
			if(j==4) {
				System.out.println("This is four");
				continue;
			}
			System.out.println(j);
		}
		
		
	}
}
