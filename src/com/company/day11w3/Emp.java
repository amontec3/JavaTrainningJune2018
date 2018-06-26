package com.company.day11w3;

//static binding example- static, final, or private

//review static vs dynamic binding

public class Emp extends Human{
	
	Emp(){
		super("homo");
	}
	public static void main(String [] args) {
		Human obj = new Emp();
		Human obj2 = new Human("homo");
		Emp obj3 = new Emp();
		obj.walk();
		obj2.walk();
	}
	//@Override
	public  void walk() {
		System.out.println("Emp can walk");
	}



}


class Human {
	String species ;
	
	Human(String species){
		this.species=species;
	}
	public  void walk(){
		System.out.println("Human can walk");
	}
	public  void jump(){
		System.out.println("Human can jump");
	}
}