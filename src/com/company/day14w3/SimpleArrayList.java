package com.company.day14w3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleArrayList {
	static ArrayList<String> arrList = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> st = new ArrayList<Integer>();
		System.out.println(st.size());
		
		st.add(56);
		st.add(45);
		st.add(67);
		st.add(76);
		st.add(95);
		st.add(0007);
		//for loop list print
		for (int i =0 ; i<st.size(); i++) {
			if(i==0) {
				System.out.print("["+st.get(i)+", ");
			}else if(i==(st.size()-1)) {
				System.out.print(st.get(i)+"]\n");
			}
			else {
				System.out.print(st.get(i)+", ");
			}
		}
		//enhanced for loop list print
		System.out.print("[");
		for(Integer i:st) {
			System.out.print(i+", ");
		}
		System.out.print("]\n");
		//toString() list print
		System.out.println(st);
		
		//while loop
		
		int i =0;
		while(i<st.size()) {
			if(i==0) {
				System.out.print("["+st.get(i)+", ");
			}else if(i==(st.size()-1)) {
				System.out.print(st.get(i)+"]\n");
			}
			else {
				System.out.print(st.get(i)+", ");
			}
			i++;
		}
		
		System.out.print("[");
		Iterator<Integer> it = st.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+", ");
		}
		System.out.print("]\n");

	}
	
	public static void arrayListExample() {
		
	}

}
