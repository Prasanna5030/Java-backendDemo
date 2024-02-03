package com.jbdc;

import java.sql.*;

import java.util.*;



public class preparedSatementDemo {

	public static void main(String[] args) {
		String username="root";
		String password="Prasanna@5030";
		String url ="jdbc:mysql://localhost:3306/cms";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection(url,username,password);
			String query="insert into students values(?,?,?,?,?,?)";
			
			PreparedStatement pstmt= connection.prepareStatement(query);
			Scanner sc= new Scanner(System.in);
	
			while(true) {
				System.out.println("enter student id: ");
				int id = sc.nextInt();
				System.out.println("enter first name:");
				String first_name = sc.next();
				System.out.println("enter last name: ");
				
				String last_name= sc.next();
				System.out.println("enter date of birth: ");
				String date_of_birth=sc.next();
				System.out.println("enter enrollment date: ");
				String enrollment_date=sc.next();
				System.out.println("enter session name :");
				String session_name= sc.next();
				
				pstmt.setInt(1, id);
				pstmt.setString(2, first_name);
				pstmt.setString(3, last_name);
				pstmt.setString (4,date_of_birth);
				pstmt.setString(5,enrollment_date );
				pstmt.setString(6, session_name);
				
				int i= pstmt.executeUpdate();
				System.out.println(" Inserted"+i+"row successfully");
				
				System.out.println("Do you want to insert another Record ? 'Yes' or 'No' ");
				String answer= sc.next();
				if(!answer.equalsIgnoreCase("Yes")) {
					break;
				}
			}
			sc.close(); 
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
