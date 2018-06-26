package com.company.day14w3;
/*
 * 1. Java coLLECTIONS fRAMEWORK
 *  List interface
 *  Map interface
 * 
 * 2. Java Generic classes and methods
 * 
 * -----------------------------------------
 * 
 * 1.List Interface
 * 	1. List
 * 		1.1 ArrayList
 * 		1.2 LinkedList
 * 		1.3 Vector   - Thread SAFE
 *	2. Set
 *		2.1 LinkedHashSet
 *		2.1 TreeSet
 *
 *	3. Queue
 *		3.1 LinkedList
 *		3.2 PriorityQueue
 * 
 * 
 * 2. Map Interface
 * 	1. HashTable
 *	2. LinkedHashMap
 * 	3. HashMap
 * 	4. TreeMap
 * 
 * */

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import com.company.day8w2.MainClass;

public class JavaCollectionsFrameworkNotes {

	
	
	public static void main(String [] args) {
		List<String> sAL = new ArrayList<String>();
		//List<String> strings = Arrays.asList("foo", "bar", "baz");
		System.out.println(sAL.size());
		sAL.add("HI");
		sAL.isEmpty();
		sAL.get(0);
		sAL.add(0, "HI2");
		System.out.println(sAL.set(1, "H3"));
		
		
		System.out.println("---------LIST CONTENTS----------");
		
		for (String a: sAL) {
			System.out.println(a);
		}
		System.out.println(sAL);
		sAL.remove(0);
		System.out.println(sAL);


	}
	

	
	
}
