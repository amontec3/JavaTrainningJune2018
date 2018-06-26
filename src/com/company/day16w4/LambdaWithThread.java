package com.company.day16w4;

public class LambdaWithThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//This is an example of Inner class
		Thread task1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Starting of Thread One");
			}
		});
		
		Thread task2 = new Thread(() -> System.out.println("Starting of Thread two from lambda function"));
	


		
		task1.start();
		//task1.join();
		task2.start();
		
		

	}

}
