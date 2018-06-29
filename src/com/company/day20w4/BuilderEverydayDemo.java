package com.company.day20w4;

public class BuilderEverydayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder builder = new StringBuilder();
		
		builder.append("This is an example");
		builder.append("of the builder pattern. ");
		builder.append("It has methods to append ");
		builder.append("almost anything we want to a string. ");
		builder.append(42);
		
		System.out.println(builder.toString());
		
		
		
	}

}
