package com.company.day20w4;

public class EmployeeRecord implements Prototype {
	private int id;
	private String name, designation;
	private double salary;
	private String address;
	
	
	
	
	public EmployeeRecord() {
		System.out.println(" Employee Records of oracle Corporation");
		System.out.println(" ---------------------------------------");
		System.out.println("E id"+"\t"+"E name"+"\t"+"E designation"+"\t"+"E salary"+"\t"+"E address");
		
	}
	public EmployeeRecord(int id, String name, String designation, double salary, String address) {
		this();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}

	public void showRecord() {
		System.out.println(this.id+"\t"+this.name+"\t"+this.designation+"\t"+this.salary+"\t"+this.address+"\n");	
	}
	
	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return new EmployeeRecord(id,name,designation,salary,address);
	}

}
