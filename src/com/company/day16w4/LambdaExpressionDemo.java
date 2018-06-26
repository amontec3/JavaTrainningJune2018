package com.company.day16w4;

public class LambdaExpressionDemo{
	//Lambda Expression - released on java 8 version
	//allow for a one line method creation
	
	// type vname = (input parameters) -> {implementation};
	
	public void sayHello() {
		System.out.println("Hello!");
	}
	//sayHello = () ->{System.out.println("Hello!")};
	
	
	
//	public double doubleRet(double a, double b, double d) {
//		return a+b;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ForLambda dr = (a, b, c) -> {return a+b+c;};
		ForLambda dr = (a, b, c) -> a+b+c;

		
//		ForLambda dr = (a, b, c) -> {
//			double x = a+b;
//			return x+c;
//			
//		};

		NumericTest isEven = (n) -> (n % 2) == 0;
		NumericTest isNegative = (n) -> (n < 0);

		// Output: false
		System.out.println(isEven.computeTest(5));

		// Output: true
		System.out.println(isNegative.computeTest(-5));
		
		
		
		MyGreeting morningGreeting = (str) -> "Good Morning " + str + "!";
		MyGreeting eveningGreeting = (str) -> "Good Evening " + str + "!";
	  
	  	// Output: Good Morning Luis! 
		System.out.println(morningGreeting.processName("Luis"));
		
		// Output: Good Evening Jessica!
		System.out.println(eveningGreeting.processName("Jessica"));
		
		
		
		System.out.println(dr.doubleRet(2.3, 2.3, 2.3));
		
	}
	
}
@FunctionalInterface
interface ForLambda{
	double doubleRet(double a, double b, double c);

}
@FunctionalInterface
interface NumericTest {
	boolean computeTest(int n); 
}
@FunctionalInterface
interface MyGreeting {
	String processName(String str);
}
