package com.company.day8w2;

public class MainClass {
	int num = 10;
	String str = "test";
	MainClass(){
		//System.out.println("Created Object from MainClass class constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex = new Example();
		ex.decp();
	}
	
	void decp() {
		System.out.println("decp() method called from MainClass definition");
	}
	
}



class Example extends MainClass{
	Example(){
		System.out.println("Created Object from Example class constructor");
	}
	
	void decp(){
		System.out.println("decp() method called from Example class definition ");
		super.decp();
	}
	
	
}


