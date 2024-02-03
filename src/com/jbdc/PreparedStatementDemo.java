package com.jbdc;

import java.sql.*;


public class PreparedStatementDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "Prasanna@5030");
			PreparedStatement ps= connection.prepareStatement("select * from students");
			
		
			ResultSet rs= 	ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("Student_id");
				String first_name= rs.getString("first_name");
				String last_name= rs.getString("last_name");
				Date date_of_birth= rs.getDate("date_of_birth");
				Date enrollment_date= rs.getDate("enrollment_date");
				String session_name=rs.getString("session_name");
				
				System.out.println("id : "+id+"  first name:"+first_name+"  last name :"+last_name+"  dateofbith :"+date_of_birth+"  enrollmentdate :"+enrollment_date+"  sessionname :"+session_name);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
