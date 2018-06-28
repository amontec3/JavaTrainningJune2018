package com.company.day18w4;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsPeriodicExample {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
		Runnable task = ()->{
			System.out.println("Executing Task At " +System.nanoTime());
		};
		
		System.out.println("Scheduling task to be executed every 2 seconds with an initial delay of 0 seconds");
		scheduledExecutorService.scheduleAtFixedRate(task,0,2,TimeUnit.SECONDS);
		
		//scheduledExecutorService.shutdown();
	
		Callable<String> callable = new Callable<String>() {
		@Override 
		public String call() throws Exception{
			Thread.sleep(2000);
			return "Return some result";
		}};
		
		
		Callable <String> myCallable = () -> {
			Thread.sleep(2000);
			return "Return some result";
		};
		
		
		Callable <Integer> myCallable1 = () -> {
			Thread.sleep(2000);
			return 20;
		};
		
		try {
			myCallable.call();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}




}

