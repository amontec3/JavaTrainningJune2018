package com.company.day14w3;

import java.util.ArrayList;
import java.util.LinkedList;

public class SimpleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList();
	}
	
	public static void linkedList() {
		LinkedList<String> link = new LinkedList<String>();
		
		link.add("DC");
		link.add("New York");
		link.add("Boston");
		link.add("Baltimore");
		

		System.out.println("Full City list: "+link);
		
		link.addFirst("Chicago");
		link.addLast("Houston");
		
		System.out.println("After adding cities: "+link);
		
		Object firstVar = link.get(0);
		Object thirdVar = link.get(2);
		System.out.println(firstVar+" "+thirdVar);
		
		link.set(0, "SFO");
		link.set(3, "Kansas");
		
		System.out.println("After set:" + link);
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Phoenix");
		arrList.add("San Antonio");
		arrList.add("Dallas");

		link.addAll(arrList);

		System.out.println("After adding arraylist:" + link);
		
		System.out.println("Index for New York City:" + link.indexOf("New York"));
		
		link.clear();
		
		System.out.println("After clearing linked list:" + link);
		
	}

}
