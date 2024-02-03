package com.jbdc;

import java.sql.*;
import java.util.Scanner;


public class InsertDemo2 {

	public static void main(String[] args) {
		String UserName="root";
		String password="Prasanna@5030";
		String url="jdbc:mysql://localhost:3306/cms";
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(url, UserName, password);
			Statement  stmt= connection.createStatement();
			Scanner sc= new Scanner(System.in);
			
			
			
			while(true) {
			System.out.println("enter id: ");
			int student_id= sc.nextInt();
			
			System.out.println("enter first name: ");
			String first_name= sc.next();
			
			System.out.println("enter last name: ");
			String last_name= sc.next();
			System.out.println("enter date of birth: ");
			String date_of_birth= sc.next();
			
			
			System.out.println("enter enrollment date: ");
			String enrollment_date= sc.next();
			System.out.println("enter session name: ");
			String session_name= sc.next();
			
			System.out.println("Insert another Record ? 'Y' or 'N' ");
			String answer= sc.next();
			
			if(answer.equalsIgnoreCase("n"))
				break;
			}
			
			String query="INSERT INTO students(student_id, first_name, last_name, date_of_birth,enrollment_date,Session_name) values(" + +"'first_name'"+"'last_name'"+"'date_of_birth'"+"'enrollment_date'"+"'session_name'"+")";
			
			
			int rowsUpdated=stmt.executeUpdate(query);
			
		
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		
	}

}
