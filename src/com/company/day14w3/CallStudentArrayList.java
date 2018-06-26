package com.company.day14w3;

import java.util.ArrayList;

//create linked list class implementation  with plain old java object
//

public class CallStudentArrayList extends Student{

	
	
	public CallStudentArrayList(String stuName, int rollNo, int stuAge) {
		super(stuName, rollNo, stuAge);
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleTestForPOJO();
	}

	private static void sampleTestForPOJO() {
		// TODO Auto-generated method stub
		ArrayList <Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student("Mike", 11, 23));
		arrayList.add(new Student("Peter", 23, 34));
		arrayList.add(new Student("Dave", 12, 32));

		System.out.println(arrayList);
	}

}
