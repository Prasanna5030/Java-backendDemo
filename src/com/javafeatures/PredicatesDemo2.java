package com.javafeatures;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	String username ;
	String password ;
	public User(String username, String password) {
		this.username= username;
		this.password= password;
		
	}
	public User() {
		username="xyz";
		password="xyz";
	}
}
public class PredicatesDemo2 {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your username");
	    String name=sc.next();
	    System.out.println("Enter your password");
	    String pwd=sc.next();
	    
	    User u1= new User(name, pwd);
		 Predicate<User> predicate = user-> user.username.equalsIgnoreCase("prasannakumar") && user.password.equalsIgnoreCase("Prasanna@5030") ;
	    
		 if(predicate.test(u1)) {
	    	System.out.println("user logged in");
	    	sc.close();
	    }else {
	    	System.out.println("invalid email and password");
	     }
	}

}
