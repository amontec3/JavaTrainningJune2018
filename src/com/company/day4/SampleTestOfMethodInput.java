package com.company.day4;

public class SampleTestOfMethodInput {

	
	public static boolean sleepIn (boolean weekday, boolean vacation) {
		if((weekday==true) && (vacation==false)) {
			return false;
		}else {//assuming we
			return true;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub   WE SLEEP IN IF ITS NOT A WEEKDAY AND WE ARE ON VACATION

		System.out.println(sleepIn(false,false));//weekend and not in vacation    TRUE? √ optional
		System.out.println(sleepIn(true,false)); //weekday not in vacation        FALSE √
		System.out.println(sleepIn(false,true)); //weekend in vacation            TRUE √

	}

}
