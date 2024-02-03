package com.multithreading;

import healthcare.Doctor;
import healthcare.Surgeon;

class A1 implements Runnable{
	public void run () {
		System.out.println("Thread running "+ Thread.currentThread().getName());
		Doctor d1= new Doctor("prasanna", 24);
		Doctor d2= new Doctor("supriya", 23);
		Doctor d3= new Doctor("kumar", 26);
		Doctor d4= new Doctor("priya", 27);
		Doctor d5= new Doctor("mary", 30);
		
		Doctor[] listofDoctors= {d1,d2,d3,d4,d5};
		
		for(Doctor d : listofDoctors) {
			System.out.printf("Doctors's Name :%s , Age:%s \n",d.name,d.getAge());
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e ) {
				e.printStackTrace();
			}
		}
	}
}

class B1 implements Runnable{
	public void run () {
		System.out.println("Thread running "+ Thread.currentThread().getName());
		Surgeon s1= new Surgeon("Dr.charlos");
		Surgeon s2= new Surgeon("Dr.kelly");
		Surgeon s3= new Surgeon("Dr.mike");
		Surgeon s4= new Surgeon("Dr.peter");
		Surgeon s5= new Surgeon("Dr.henry");
		
		Surgeon[] listofSurgeons= {s1,s2,s3,s4,s5};
		
		for(Surgeon s : listofSurgeons) {
			System.out.printf("Surgeons Name  %s\n:",s.name);
//			try {
//				Thread.sleep(2000);
//			}catch(InterruptedException e ) {
//				e.printStackTrace();
//			}
		}
		
	}
}

public class RunnableDemo {

	public static void main(String[] args) {
		A1 obj1= new A1();
		B1 obj2= new B1();
		System.out.println("Thread running "+ Thread.currentThread().getName());
		Thread t1= new Thread(obj1);
		Thread t2= new Thread(obj2);
		t1.start();
		t2.start();
		

	}

}
