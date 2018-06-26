package com.company.day8w2;

public class AbstractionSample {
	private static int num = 10;
	String str = "Test";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionSample ab = new AbstractionSample();
		ab.setNum(20);
		System.out.println(ab.getNum());
//		num =15;
//		System.out.println(num);
	}

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		AbstractionSample.num = num;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
