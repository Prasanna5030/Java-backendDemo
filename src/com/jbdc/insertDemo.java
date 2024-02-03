package com.jbdc;

import java.sql.*;
import java.util.Scanner;

public class insertDemo {

	public static void main(String[] args) {
		String username="root";
		String password= "Prasanna@5030";
		String url ="jdbc:mysql://localhost:3306/cms";
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
		
		
		try {
			
			Statement stmt = connection.createStatement();
			while(true) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("Enter first name:");
			String first_name=sc.next();
			System.out.println("Enter last name:");
			String last_name=sc.next();
			System.out.println("Enter date of birth :");
			String date_of_birth=sc.next();
			System.out.println("Enter enrollment date:");
			String enrollment_date=sc.next();
			System.out.println("Enter session name:");
			String session_name=sc.next();
			
			
			String query="INSERT INTO STUDENTS VALUES("+ id +",'" +first_name+"','"+ last_name+"','"+ date_of_birth+"','"+enrollment_date+"','"+session_name+"')";
			
//			String sqlCommand = "INSERT INTO STUDENTS("
//					+ "student_id, first_name, last_name, date_of_birth, enrollment_date, session_name)"
//					+ " VALUES( " + id + ", '" + first_name + "','" + last_name + "','" + date_of_birth + "','"
//					+ enrollment_date + "','" + session_name + "')";

			
			int rowseffected= stmt.executeUpdate(query);
			System.out.printf("%s row(s) effected",rowseffected);
			
			System.out.println("\n Do You Want to Enter another Record ? 'Y' or 'N' ");
			String answer = sc.next();
			if(!answer.equalsIgnoreCase("y")) {
				sc.close();	
			}
			
			}	
	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
