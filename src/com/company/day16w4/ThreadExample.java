package com.company.day16w4;

import java.util.ArrayList;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("From main method thread");
		
		Thread subclassForThread = new SubclassForThread();
		 
		SubclassForThread st = new SubclassForThread();
		
		subclassForThread.start();
		st.start();
		
		
		
		new Thread(){
			@Override
			public void run() {
				System.out.println("The thread from anonymous class");
				
				ArrayList<Object> ls = new ArrayList<>();
				ls.add("hello");
				ls.add("world");
				for(Object a : ls) {
					System.out.println(a);
				}
			}
		}.start();
		
		System.out.println("Hello again from main thread");
		
		
	}

}


class SubclassForThread extends Thread{
	@Override
	public void run(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("The thread from another class");
	}
}