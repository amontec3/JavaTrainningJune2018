package com.company.day21w5;

import java.util.Calendar;

public class FactoryEverydayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		
		
		System.out.println(cal);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	}

}
