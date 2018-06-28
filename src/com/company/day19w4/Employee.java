package com.company.day19w4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.company.day16w4.Person;

public class Employee <	T1, T2>{
	
	T1 fname,lname,dept;
	T2 id;
	public Employee(T1 fname, T1 lname, T1 dept, T2 id) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dept = dept;
		this.id = id;
	}
	public T1 getFname() {
		return fname;
	}
	public void setFname(T1 fname) {
		this.fname = fname;
	}
	public T1 getLname() {
		return lname;
	}
	public void setLname(T1 lname) {
		this.lname = lname;
	}
	public T1 getDept() {
		return dept;
	}
	public void setDept(T1 dept) {
		this.dept = dept;
	}
	public T2 getId() {
		return id;
	}
	public void setId(T2 id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", dept=" + dept + ", id=" + id + "]";
	}

	public static <E,T1> void printList(List<E> list, T1 s){
		for(E i: list) {
			if(i.getClass().equals(Employee.class)) {
				if(((Employee)i).getDept().equals("Accounting")) {
					System.out.println(i);
				}
			}
		}
		
	}
	public static void main(String [] args) {
		
		
		ArrayList <Employee> arrayList = new ArrayList<>();
		arrayList.add(new Employee<String,Integer>("Mike", "Lee", "Accounting",987));
		arrayList.add(new Employee<String,Integer>("Harold", "Mon", "Engineering",342));
		arrayList.add(new Employee<String,Integer>("Karen", "Less", "HR",485));
		
		ArrayList <Employee> arrayList1 = new ArrayList<>();
		arrayList1.add(new Employee<String,Long>("Mike", "Lee", "Accounting",98712312312L));
		arrayList1.add(new Employee<String,Long>("Harold", "Mon", "Engineering",3213123242L));
		arrayList1.add(new Employee<String,Long>("Karen", "Less", "HR",48123123125L));
		
		System.out.println("Arraylist with Integer ID");
		printList(arrayList,"Accounting");
		System.out.println("Arraylist with Long ID");
		printList(arrayList1,"HR");

	}
	
	
	



}
