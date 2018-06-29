package com.company.day20w4;

public class PrototypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//NO IMPUT STREAM-PROMPT
		
		
		EmployeeRecord e1 = new EmployeeRecord(1234,"Joe","Accounting",234543.45,"123 word street");
		e1.showRecord();
		System.out.println("\n");
		
		EmployeeRecord e2 = (EmployeeRecord)e1.getClone();
		e2.showRecord();

//		

		
		
	}

}
