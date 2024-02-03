package com.jbdc;
import java.sql.*;
import java.util.*;

public class SavepointDemo {

	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root", "Prasanna@5030");
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		Savepoint s1= connection.setSavepoint("SavaPoint1");
		try {
		
			PreparedStatement pstmt= connection.prepareStatement("INSERT INTO STUDENTS VALUES(?,?,?,?,?,?)");
			Scanner sc= new Scanner(System.in);
			  connection.setAutoCommit(false);
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
				
				pstmt.addBatch();
				
			
				System.out.println("insert another record ? press -1 to quit");
				String ans=sc.next();
				if(!ans.equalsIgnoreCase("yes"))
					break;
			}
			int[] result=pstmt.executeBatch();
			System.out.println("inserted "+Arrays.toString(result)+"row(s) succesfully");
			
			connection.commit();
		
			throw new RuntimeException("throwing runtime error to check savepoint");
		
		} catch (Exception e) {
			System.out.println("Inside exception ");
			connection.rollback(s1);
			e.printStackTrace();
		}
		
	}
}
