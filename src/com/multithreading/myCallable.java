package com.multithreading;

import java.util.concurrent.Callable;

public class myCallable implements Callable<Integer>{
	public Integer call() throws InterruptedException {
		int sum =0;
		Thread.sleep(500);
		for(int i=0 ; i<=500; i++) {
			Thread.sleep(100);
			System.out.println(sum);
			sum= sum+i;
			
		}
		return sum;
		
	}

}




