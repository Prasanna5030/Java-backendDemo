package com.javafeatures;

interface A{
	void show (int i);

	
}

interface B{
	int square(int i);
}
//class B implements A{
//	public void show() {
//		System.out.println("inside Show method");
//	}
//}
public class lambdas {
	
	public static void main(String[] args) {
		
		B b1= (i)->i*i;
		
		System.out.println(b1.square(4));
		
		
		A obj = (i)->System.out.println("hello"+i);

		obj.show(10);

	
		
	}

}
