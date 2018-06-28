package com.company.day18w4.generics;

import java.util.ArrayList;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> al = new ArrayList<>();
		al.add("Hello");
		al.add(78);
		al.add(true);
		
		
		System.out.println(al.get(0).getClass());
		
		System.out.println(al);
		
		
	}

}
