package com.company.day17w4;

public class ThreadSleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] names = {"Mike","Peter", "Sammy","Steve"};
		
		Thread t1 = new Thread(()->{
			for(String a : names) {
				try {
					Thread.currentThread().sleep(2000);
					System.out.println(a);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			names[0]="Yolo";
			System.out.println("Done changing Mike -> Yolo");
		});
		
		t1.start();
		t2.start();

		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Starting for loop in main...");
		
		for(String i : names) {
			System.out.println(i);
		}
	}

}
