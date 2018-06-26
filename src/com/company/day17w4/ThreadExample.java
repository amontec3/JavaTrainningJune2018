package com.company.day17w4;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside: "+Thread.currentThread().getName());
		
		
		System.out.println("Creating thread...");

		Thread task0 = new Thread(()->{
			System.out.println("Inside: "+Thread.currentThread().getName());
			});
		System.out.println("Starting Thread...");

		Thread task1 = new Thread(()->{
			Thread.currentThread().setName("Boss Thread");
			System.out.println("Inside: "+Thread.currentThread().getName());
			});
		
		Thread task2 = new Thread(new Yolo());
		
		Thread task3 = new Yolo1();
		
		Thread task4 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("From anonymous class ");
			}
		});
		
		task0.start();
		task1.start();
		task2.start();
		task3.start();
		task4.start();


	}
	
}

class Yolo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("From class that implements Runnable interface");
	}
	
}

class Yolo1 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("From class that extends Thread class");
	}
	
}