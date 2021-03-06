package com.company.day17w4;

import java.util.function.BiConsumer;

public class LambdaExceptionsOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] someNumbers = {1,2,3,4};
		int key = 0;
		
		process(someNumbers,key,wrapperLambda((v,k)->System.out.println(v/k)));
	}
	
	
	//method for lamda expression
	private static void process(int [] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i : someNumbers) {
			consumer.accept(i,key);
		}
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer) {
		return (v,k) -> {
			try {
				consumer.accept(v,k);
			}catch(ArithmeticException e) {
				e.printStackTrace();
				System.out.println("Cannot divide by zero.");
			}
		};
	}
}
