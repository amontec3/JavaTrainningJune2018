package com.company.day17w4;

import java.util.function.Consumer;

public class MethodRefPartOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> c = s -> System.out.println(s);
		Consumer<String> x = System.out::println;

		c.accept("Hi");
		x.accept("yolo");
		Runnable a = () -> System.out.println("yo");
		Runnable b = () -> printMessage(); // = MethodRefPartOne :: printMessage

		
		Thread task = new Thread(MethodRefPartOne :: printMessage);
		task.start();		
	}
	
	public static void printMessage() {
		System.out.println("Hello message");
	}

	
	
	
}
