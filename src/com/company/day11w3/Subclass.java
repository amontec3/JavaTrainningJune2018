package com.company.day11w3;
//review super(); method for constructor
public class Subclass extends Superclass{
	
	int someNumber = 25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass sb = new Subclass();
		sb.printNumber();
		sb.printMsg();

	}
	
	void printNumber() {
		System.out.println(super.someNumber);
	}
	void display() {
		System.out.println("From Subclass");
	}
	void printMsg(){
		display();
		super.display();
	}

}



class Superclass {
	int someNumber = 20;
	
	void display() {
		System.out.println("From Superclass");
	}
	
}