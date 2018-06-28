package com.company.day19w4;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object myObject = new Object();
		String str = "hey";
		myObject=str;
		
		System.out.println(myObject);
		
		Employee1 emp = new Employee1();
		
		Accountant acct = new Accountant();
		emp=acct;
		
		ArrayList<Employee1> arrlist1 = new ArrayList<>();
		arrlist1.add(new Employee1());
		ArrayList<Accountant> arrlist2 = new ArrayList<>();
		arrlist2.add(new Accountant());
		
		//arrlist1 = arrlist2;
		
		ArrayList<?> arr = new ArrayList<>(); //? wildcard will accomodate any type
		arr = arrlist1;
		arr = arrlist2;
		//allows arr1 to equal list of child objects or Employee1 objects
		ArrayList<? extends Employee1> arr1 = new ArrayList<>(); 
		arr1=arrlist2;
		//arr1.add(emp);
		//arr1.add(emp);
		//arr1.add(acct);
		
		//allows arr2 to equal list of Parent objects or Employee1 objects
		ArrayList<? super Employee1> arr2 = new ArrayList<>(); 
		ArrayList<Object> a2 = new ArrayList<>();

		arr2=a2;

		makeEmployeeWork(arrlist1);
		makeEmployeeWork(arrlist2);

		
	}
	
	public static void makeEmployeeWork(List <? extends Employee1> emp) {
		for(Employee1 a : emp) {
			a.work();
		}
	}
	
}


class Employee1{
	public void work() {
		System.out.println("Employee working...");
	}
}


class Accountant extends Employee1{
	public void work() {
		System.out.println("Accountant working...");
	}
}