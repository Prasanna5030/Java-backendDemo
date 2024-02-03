package demo;

import java.util.HashSet;
import java.util.Iterator;

import healthcare.Doctor;

public class HashSetDemo {

	public static void main(String[] args) {
		System.out.println("HashSet demo \n \n  ");
		HashSet<Doctor> setofDoctors =new HashSet<Doctor>();
		
		Doctor d1 =new Doctor("shay", 31);
		Doctor d2 =new Doctor("mike", 36);
		Doctor d3 =new Doctor("john", 45);
		Doctor d4 =new Doctor("brat", 51);
		Doctor d5 =new Doctor("kay", 38);
		Doctor d6 =new Doctor("walter", 57);

		
		setofDoctors.add(d1);
		setofDoctors.add(d2);
		setofDoctors.add(d3);
		setofDoctors.add(d4);
		setofDoctors.add(d5);
		setofDoctors.add(d6);
		System.out.println("Looping through setofDocctors set (collection of doctor objects ) \n ");
    Iterator<Doctor>	itr=setofDoctors.iterator();
		while(itr.hasNext()) {
			Doctor d= itr.next();
			System.out.printf("%s %s \n",d.name,d.getAge());
			
		}
		
		setofDoctors.remove(d2);
		setofDoctors.remove(d4);
		
		System.out.println("Looping through setofDocctors set after removing objects \n ");
		Iterator<Doctor> it = setofDoctors.iterator();
		while(it.hasNext()) {
			Doctor d= it.next();
			System.out.printf("%s %s \n",d.name,d.getAge());
		}
		
	}

}
