package com.company.day5;

public class SomeTest {

	//method return sum of parameters unless they are equal in value in which case it return double the sum
	public static int sumDouble(int a, int b) {
		return (a==b) ? 2*(a+b):a+b;
	}
	
	public static boolean makes10(int a, int b){
		//if a or b are equal to 10 or their sum is equal to 10, return true
		return (a==10 || b==10) || (a+b ==10) ? true:false; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sumDouble(1,2));
		System.out.println(sumDouble(3,2));
		System.out.println(sumDouble(2,2));
		System.out.println();
		
		System.out.println(makes10(9,10 ));
		System.out.println(makes10(9,9 ));
		System.out.println(makes10(1,9 ));
	}

}


/* WEEK 2
 * 1. exception handling
 * 2. git hub
 * 3. java oop
 * 4. java i/o stream
 * 5. collections
 * 6. generics
 * 
 * ASSIGNEMNT - INSTALL GIT HUB
 */