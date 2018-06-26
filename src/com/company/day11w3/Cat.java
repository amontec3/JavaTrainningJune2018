package com.company.day11w3;
//abstract classs review
 abstract class Animal extends Thing{


	public abstract void sound();
	public abstract void move();


}

public class Cat extends Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Meeeeaaaauuuuu!");
		
	}
	
	@Override
	public void thingmethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Booooom!");
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Animal ob = new Cat();
		
		ob.sound();
		ob.move();
	}
	
}


abstract class Thing {
	public abstract void thingmethod();
}