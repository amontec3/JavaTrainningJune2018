package com.company.day14w3;

import java.util.List;
import java.util.Vector;

public class ListToArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a1 = new Vector<String>();
		a1.add("text 1");
		a1.add("text 2");
		a1.add("text 3");
		System.out.println(a1);

		List<String> a2 = new Vector<String>();
		a2.add("text 4");
		a2.addAll(a1);
		System.out.println(a2);

		java.util.Collections.sort(a2);
		//java.util.Collections.reverse(a2);
		System.out.println(a2);
		
		
		
	}

}
