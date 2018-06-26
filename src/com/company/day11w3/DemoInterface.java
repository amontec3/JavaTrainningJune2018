package com.company.day11w3;

public class DemoInterface implements MyInterface,SecondInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface i = new DemoInterface();
		i.method1(8);
		i.method2();
		
		SecondInterface i2 = new DemoInterface();
		i2.method3();
		
		DemoInterface all = new DemoInterface();
		all.method1();
		all.method2();
		all.method3();
		
	}

	@Override
	public int method1(int a) {
		// TODO Auto-generated method stub
		System.out.println("Method 1 return int");
		return 0;
		
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1 return int");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Method 3");

	}

}

interface MyInterface{//all methods in interface are default treated as abstract methods
	public int method1(int a);
	public void method2();
	public void method3();

	
}
interface SecondInterface{
	public void method1();

	public void method3();
}
