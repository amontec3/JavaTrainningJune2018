package com.company.day1;

import java.util.Scanner;

public class DayOne {
	
//	static String str = "Test";
//	static int num1 = 12;
	
	public static void main(String [] args){
		//Assignment, calculator class that handles 2 inputs (ints and doubles), then user decides what operation to use, then shows result
		/*
		 * DATA TYPES
		 * 1. Primitive data types : no need to initialize with 'new' key word
		 *      boolean, byte, char, short, int, long, float, double
		 * 2. Reference data types
		 *    String, Integer... and more
		 * */
		Scanner scan = new Scanner(System.in);
		byte num = 112;
		short num1 = 23455;
		char ch = 'A';
		int num2 = 4;
		float num3 = 12.98f;
		double num4 = 12.9888d;
		long num5 = 23123123;
		System.out.println("byte variable value" + num);
		System.out.println("short variable value" + num1);
		System.out.println("char variable value" + ch);
		System.out.println("int variable value" + num2);
		System.out.println("float variable value" + num3);
		System.out.println("double variable value" + num4);
		System.out.println("long variable value" + num5);
		
		SumTwoVars.sumVars();

		System.out.println("float plus double = "+(num3+num4));
		System.out.println("float plus int = "+(num3+num2));
		
		System.out.println("Enter a float value: ");
		float float1 = scan.nextFloat();
		System.out.println("Enter a double value: ");
		double double1 = scan.nextDouble();
		
		scan.close();
		
		System.out.println("Sum of float: " + float1 +" and double: "+double1 + " is " +(double1+float1));
		
		
		
		
		
		/*
		 * Local Variable
		 * Static Variable : no need tobe initialized, exists in the class
		 * Instance Variable : a version/copy of a model class
		 * ?Global variable: accessible by all methods in a class
		 * */
		
//		System.out.println(str);
//		System.out.println(num1);
		
		
		
//		System.out.println("Hello World!");
//		//System.out.println("this is from get All ");
//		DayOnePartTwo dayOne = new DayOnePartTwo();
//		
//		//variable calls
//		dayOne.getAll();
//		dayOne.getOne();
//		
//		//static calls
//		DayOnePartTwo.getAll();
//		DayOnePartTwo.getOne();
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the name");
//		String str = scan.nextLine();
//		System.out.println("Now enter a number:");
//		int num = scan.nextInt();
//		scan.close();
//		System.out.println("The name that you entered is: "+str);
//		System.out.println("The number that you entered is: " + num);
//		
////		System.out.println(args[0]);
////		System.out.println(args[1]);
////		System.out.println(args[2]);
	}
	//Review meanings of the following: JRE, JDK and JVM
	/*
	 * JVM : Java Development Kit: interpreter to execute java programs (byte code) line by line
	 * JRE : Java Runtime Environment: environment to run java applications
	 * JDK : Java Virtual Machine: environment to develop, compile and run java application
	 * 
	 * 
	 * JVM : Java Virtual Machine: interpreter to execute java programs (byte code) line by line
	 * JRE : Java Runtime Environment: JVM + Libraries to run java program
	 * JDK : Java Development Kit: JRE + Tools to develop java programs
	 * 
	 * JVM : Java Virtual Machine is an interpreter of the java byte code created by the compiler in JDK. Platform dependent.
	 * JRE : Java Runtime Environment contains the JVM and Library files, minimum requirement for running code. Platform dependent.
	 * JDK : Java Development Kit contains the JRE, compiler, Debugger and additional Developer Libraries. Platform dependent.
	 * 
	 * Source code -> Compiler -> Java ByteCode (.class files) -> JVM (Interpreter) -> Object code for machine 
	 * 
	 * */
	
}


