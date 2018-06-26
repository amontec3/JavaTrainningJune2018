package com.company.day11w3;
//abstract class - partial abstraction
// interface - full abstraction

public class Demo extends Sum{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sm = new Demo();
		System.out.println(sm.sumOfTwo(23, 24));
		System.out.println(sm.sumOfThree(34, 35,36));
		sm.disp();

	}

	@Override
	public int sumOfTwo(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}

	@Override
	public int sumOfThree(int n1, int n2, int n3) {
		// TODO Auto-generated method stub
		return n1+n2+n3;
	}

}


abstract class Sum{
	public abstract int sumOfTwo(int n1, int n2);
	public abstract int sumOfThree(int n1, int n2, int n3);
	public void disp() {
		System.out.println("Method disp() from Sum");
	}
}
