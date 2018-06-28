package com.company.day18w4.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Products <T1,T2>{

	T1 description;
	T2 price;
	
	

	public Products(T1 description, T2 price) {
		super();
		this.description = description;
		this.price = price;
	}



	public T1 getDescription() {
		return description;
	}



	public void setDescription(T1 description) {
		this.description = description;
	}



	public T2 getPrice() {
		return price;
	}



	public void setPrice(T2 price) {
		this.price = price;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products<String,String> p1 = new Products<>("hi","price");
		Products<Integer,String> p2 = new Products<>(1,"price");

		p2.setPrice("Done");
		
		System.out.println(p2.getPrice());
		getUnionOfSetValues();
	}
	
	public static Products callToProductClass() {
		Products<String,String> p1 = new Products<>("Name","Price");
		
		return p1;
	}
	
	
	
	public static void getUnionOfSetValues() {
		Set <String> mySet1 = new HashSet<>();
		mySet1.add("DC");
		mySet1.add("VA");
		mySet1.add("MD");

	
		Set <String> mySet2 = new TreeSet<>();
		mySet2.add("DC");
		mySet2.add("VA");
		mySet2.add("MD");
		mySet2.add("PA");
		
		Set<String> resultSet = unionOfSets(mySet1,mySet2);
		
		Iterator<String> it = resultSet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(unionOfSets(mySet1,mySet2));
	
	}
	
	private static <E> Set<E> unionOfSets(Set<E> mySet1, Set<E> mySet2){
		Set<E> results = new HashSet<>();
		results.addAll(mySet1);
		results.addAll(mySet2);
		return results;
		//return unionOfSets(mySet1,mySet2);
	}
	
	
	

}
