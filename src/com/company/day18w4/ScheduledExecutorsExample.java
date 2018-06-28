package com.company.day18w4;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
		Runnable task = ()->{
			System.out.println("Executing Task At " +System.nanoTime());
		};
		
		System.out.println("Submitting task at "+ System.nanoTime() + "to be executed after 5 seconds.");
		scheduledExecutorService.schedule(task,5,TimeUnit.SECONDS);
		
		scheduledExecutorService.shutdown();
	
	}
}
