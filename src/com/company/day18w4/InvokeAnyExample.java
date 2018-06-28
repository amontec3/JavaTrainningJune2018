package com.company.day18w4;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAnyExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService= Executors.newFixedThreadPool(5);
		
		Callable <String> task1 = ()->{
			Thread.sleep(2000);
			return "Result of Task 1";
		};
		
		Callable <String> task2 = ()->{
			Thread.sleep(1000);
			return "Result of Task 2";
		};
		
		Callable <String> task3 = ()->{
			Thread.sleep(3000);
			return "Result of Task 3";
		};
		
		String result = executorService.invokeAny(Arrays.asList(task1,task2,task3));
		System.out.println(result);

		List<Future<String>> result2 = executorService.invokeAll(Arrays.asList(task1,task2,task3));
		System.out.println(result2.toString());
		
		executorService.shutdown();
	}

}
