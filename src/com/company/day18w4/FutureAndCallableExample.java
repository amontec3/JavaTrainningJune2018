package com.company.day18w4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureAndCallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		//Callable is used to get a return value from a thread computation
		Callable <String> callable = ()->{
			//perform some computation
			 System.out.println("Entered Callable");
			 Thread.sleep(2000);
			 return "Hello from Callable";
		 };
		 
		 
		 Callable <Integer> callable1 = ()->{
			 System.out.println("Entered Callable1");
			 Thread.sleep(2000);
			 return 20;
		 };
		 
		 
		 System.out.println("Submitting Callable");
		 //Future is used to retrieve the return value from a Callable function after its execution in a thread
		 Future<String> future = executorService.submit(callable);
		 Future<Integer> future1 = executorService.submit(callable1);
		
		 
		 System.out.println("Do something else while callable is getting executed");
		 
		 System.out.println("Retrieve the result of the future");
		
		 //future.get() call waits until computation from thread completes to retrieve return value
		 String result = future.get();
		 System.out.println(result);
		 
		 Integer result1 = future1.get();
		 System.out.println("Integer form callable1 = "+result1);
		 executorService.shutdown();
	
	}

}
