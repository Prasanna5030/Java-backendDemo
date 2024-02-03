package com.multithreading;

import java.io.IOException;

class A extends Thread{
	public void run() {
		System.out.println("Thread running in cpu is "+ Thread.currentThread().getName());
		for(int i=0; i<10; i++) {
			System.out.printf("A thread running %s \n", i);
			
//			try {
//				Thread.sleep(1000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		
	}
}

class B extends Thread{
	public void run () {
		System.out.println("Thread running in cpu is "+ Thread.currentThread().getName());
		for(int i=0; i<10; i++) {
			System.out.printf("B thread running %s \n",i);
		}
	}
}

public class MultiThreadingDemo {

	public static void main(String[] args) {
		System.out.println("Thread running in cpu is "+ Thread.currentThread().getName());
		A obj1= new A();
		B obj2= new B();
		obj1.start();
		obj2.start();
	
		for( int i=0 ; i<10 ; i++) {
			System.out.printf("main thread running %s \n",i);
//			try {
//				Thread.sleep(1000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
		}

	}

}
