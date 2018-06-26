package com.company.day16w4;

public class LED1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloLambda hm = () -> System.out.println("Print Lambda!");
		hm.someMethod();
		
		AddLambda am = (int a, int b) -> a+b;
		System.out.println(am.addSum(6, 9));
		
		//if the interface is not functional it will have more than one method.
		//lambda is like the short cut of inner class because you can define a methods in main and not have to create an inner class to implement additional methods
		
	}

}
@FunctionalInterface
interface HelloLambda{
	void someMethod();
}
@FunctionalInterface
interface AddLambda{
	int addSum(int a, int b);
}
