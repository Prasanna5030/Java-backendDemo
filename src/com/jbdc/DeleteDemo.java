package com.jbdc;
import java.sql.*;
import java.util.*;
public class DeleteDemo {

	public static void main(String[] args) {
		//deletePrepStatement();
		deleteStatement();
		
	}
	public static void deleteStatement() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","Prasanna@5030");
			Statement stmt = connection.createStatement();
		
			Scanner sc = new Scanner(System.in);
			while(true) {
			System.out.println("enter id of student to be deleted :");
			int id = sc.nextInt();
			
			String query ="DELETE FROM STUDENTS WHERE student_id=' " +id+ " '";
			int i=stmt.executeUpdate(query);
			System.out.println("Deleted "+i+" Row(s) successfully");
			System.out.println("do you want to enter more rows ? yes or no");
			String answer=sc.next();
			if(!answer.equalsIgnoreCase("yes")) 
				break;
			}
			sc.close();
		}catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
			
	}
	public static void deletePrepStatement() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","Prasanna@5030");
		PreparedStatement ps=connection.prepareStatement("DELETE FROM STUDENTS WHERE student_id= ?");
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("enter id of student to be deleted ");
		int id= sc.nextInt();
		ps.setInt(1, id);
		int i =ps.executeUpdate();
		System.out.println("Deleted "+i+"row(s) successully");
		System.out.println("Do you want to delete another record ? type 'yes' or 'no' ");
		String answer=sc.next();
		if(!answer.equalsIgnoreCase("Yes"))
			break;
		}
		}
		catch(ClassNotFoundException | SQLException e){
			
		}

	}

}
