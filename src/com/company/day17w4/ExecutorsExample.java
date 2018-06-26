package com.company.day17w4;

import java.util.concurrent.Executors;

import java.util.concurrent.ExecutorService;


public class ExecutorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inside: "+Thread.currentThread().getName());
		
		System.out.println("Creating Executor Service...");
		ExecutorService executorService= Executors.newSingleThreadExecutor();
		
		System.out.println("Creating a Runnable...");
		Runnable runnable = ()->{
			System.out.println("Inside: "+Thread.currentThread().getName());
		};
		
		System.out.println("Submit the task specified by the runnable to the executor service");
		executorService.submit(runnable);
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Shutting down executor");
		executorService.shutdown();
	}

}
