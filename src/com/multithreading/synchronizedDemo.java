package com.multithreading;

class ex implements Runnable{
	static int count;
	synchronized static void counting() {
		System.out.println("Inside ");
		for(int i=0; i<10; i++) {
			System.out.println("count:"+count);
			count++;
		}
		}
	public void run() {
      counting();
		}
	}

public class synchronizedDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ex ex1= new ex();
		ex ex2= new ex();
		Thread t1= new Thread(ex1);
		Thread t2= new Thread(ex2);
		t1.start();
//	t1.join();
		t2.start();
//	t2.join();
		
		System.out.printf(" Count ex1 %s \n",ex.count);
		System.out.printf(" Count ex2 %s \n",ex.count);
		
	}

}
