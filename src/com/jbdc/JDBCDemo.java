package com.jbdc;

import java.sql.*;


public class JDBCDemo {

	public static void main(String[] args) throws SQLException {
		String username="root";
		String password="Prasanna@5030";
		String url="jdbc:mysql://localhost:3306/cms";
		String query="select * from students";
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 connection =	DriverManager.getConnection(url, username, password);
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		try {
		Statement stmt=	connection.createStatement();
		ResultSet rs= stmt.executeQuery(query);
		while(rs.next()) {
			int id= rs.getInt("student_id");
			String first_name= rs.getString("first_name");
			String last_name= rs.getString("last_name");
			String date_of_birth= rs.getString("date_of_birth");
			String enrollment_date= rs.getString("enrollment_date");
			String session_name= rs.getString("session_name");
		System.out.printf("id : %s | firstname : %s | lastname : %s | dateofbirth : %s | enrollmentdate : %s | sessionname : %s \n", id, first_name, last_name, date_of_birth, enrollment_date, session_name );
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connection.close();
		System.out.println("\n connection closed ");

	
	}

}
