package com.company.day16w4;

public class LEE2 {

	interface StringLength{
		int getSize(String str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lambda method definition
		StringLength sl = (str) -> str.length();
		
		//using lambda function
		System.out.println(sl.getSize("This is lambda with inner interface"));
		
		//passing lambda function as a parameter to a methoid
		printSize(sl);
		
		
	}
	
	
	public static void printSize(StringLength slength) {
		System.out.println(slength.getSize("This lambda method as parameter to a class method"));
	}

}
