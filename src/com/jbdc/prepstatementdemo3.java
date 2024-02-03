package com.jbdc;
import java.sql.*;
import java.util.*;

public class prepstatementdemo3{
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "Prasanna@5030");
			
			PreparedStatement ps=connection.prepareStatement("DELETE FROM STUDENTS WHERE session_name=?");
			Scanner sc = new Scanner(System.in);
			
			while(true) {
//				System.out.println("enter id of student to be deleted :");
//				int id = sc.nextInt();
				System.out.println("enter session name: ");
				String session_name= sc.next();
				
				
//			ps.setInt(1, id);
			ps.setString(1, session_name);	
		    int i= ps.executeUpdate();
		    System.out.println("Deleted "+ i+" row successfully \n");
		    System.out.println("Do you want to delete another record ? Yes or no");
		    String answer = sc.next();
		    if(!answer.equalsIgnoreCase("yes"))
		    
		    	break;
		    
			}
		  sc.close();
		  
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
