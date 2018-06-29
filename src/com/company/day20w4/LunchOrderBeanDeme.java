package com.company.day20w4;

public class LunchOrderBeanDeme {
	//Singleton --one instance
	//prototype -- cloning instance
	//Builder -- Multiple constructors, varoious options, but they build upn eachother
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LunchOrderBean lunchOrderBean= new LunchOrderBean();
		
		lunchOrderBean.setBread("Wheat");
		lunchOrderBean.setCondiments("Lettuce");
		lunchOrderBean.setDressing("Mustard");
		lunchOrderBean.setMeat("Ham");
		
		
		
		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());
		System.out.println(lunchOrderBean.getDressing());
		System.out.println(lunchOrderBean.getMeat());
		
		
		
		
		System.out.println(lunchOrderBean);
		
		
	}

}
