package com.company.day9w2;

public class Student extends Dept{

	String mainSub = "Match";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student dp = new Student();
//		System.out.println(dp.designation);
//		System.out.println(dp.nameOfDept);
//		System.out.println(dp.mainSub);
		int [] numAr = {1,2,3,4};
		int [] numAr1 = {1,2};
		dp.does(numAr,"hi","my","name","is","arnold");
		String [] array = {"hi","my","name","is","arnold","the","great"};
		dp.does(numAr1,array);
		
//		int aNumber = 3;
//		if (aNumber >= 0)
//		    if (aNumber == 0)
//		        System.out.println("first string");
//		else 
//		    System.out.println("second string");
//		System.out.println("third string");

	}

}


class Dept{
	String designation = "tutor";
	String nameOfDept = "Tech";
	
	void does(int[] nums, String... strings) {
		for(String x: strings) {
			System.out.println(x);
		}
		for(int y: nums) {
			System.out.println(y);
		}
	}
	
}