package com.company.day12w3;

public class Person {
	int age;
	int height;
	public Person(int age, int height) {
		//super();
		this.age = age;
		this.height = height;
	}
	Person(){
		System.out.println("This is person");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a = new Child();
	}

}


class Child extends Person{
	Child(){
		//super();
	}
}
