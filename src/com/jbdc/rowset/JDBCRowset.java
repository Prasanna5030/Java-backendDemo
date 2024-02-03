package com.jbdc.rowset;
import java.sql.*;
import java.sql.Date;
import java.util.*;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JDBCRowset {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			JdbcRowSet jdbcRowset = RowSetProvider.newFactory().createJdbcRowSet();
			jdbcRowset.setUrl("jdbc:mysql://localhost:3306/cms");
			jdbcRowset.setUsername("root");
			jdbcRowset.setPassword("Prasanna@5030");
			
			jdbcRowset.setCommand("SELECT * FROM STUDENTS");
			
			jdbcRowset.execute();
		
			while(jdbcRowset.next()) {
				int id= jdbcRowset.getInt("student_id");
				
				String first_name= jdbcRowset.getString("first_name");
				String last_name= jdbcRowset.getString("last_name");
				Date date_of_birth= jdbcRowset.getDate("date_of_birth");
				Date enrollment_date= jdbcRowset.getDate("enrollment_date");
				String session_name= jdbcRowset.getString("session_name");
				System.out.println("Id : "+id+" first name : "+first_name+" last_name :"+last_name+" date_of_birth : "+date_of_birth+" enrollment_date : "+enrollment_date +" session_name : "+session_name);		}
		
			
			System.out.println(" \n \n ");
			System.out.println(" Fetch a row no 10\n ");
			
//			jdbcRowset.absolute(10);
//			int id= jdbcRowset.getInt("student_id");
//			String first_name= jdbcRowset.getString("first_name");
//			String last_name= jdbcRowset.getString("last_name");
//			Date date_of_birth= jdbcRowset.getDate("date_of_birth");
//			Date enrollment_date= jdbcRowset.getDate("enrollment_date");
//			String session_name= jdbcRowset.getString("session_name");
//			System.out.println("Id : "+id+" first name : "+first_name+" last_name :"+last_name+" date_of_birth : "+date_of_birth+" enrollment_date : "+enrollment_date +" session_name : "+session_name);		
//			
			System.out.println(" \n \n ");
			System.out.println(" Fetching database afterlast rows from the table i.e, afterLast() \n "); 
			jdbcRowset.afterLast();
			int rowCount=0;
			while(jdbcRowset.previous()) {
				rowCount++;
			int id= jdbcRowset.getInt("student_id");
			String first_name= jdbcRowset.getString("first_name");
			String last_name= jdbcRowset.getString("last_name");
			Date date_of_birth= jdbcRowset.getDate("date_of_birth");
			Date enrollment_date= jdbcRowset.getDate("enrollment_date");
			String session_name= jdbcRowset.getString("session_name");
			System.out.println("Id : "+id+" first name : "+first_name+" last_name :"+last_name+" date_of_birth : "+date_of_birth+" enrollment_date : "+enrollment_date +" session_name : "+session_name);		
			if(rowCount==10)
				break;
			}
//			jdbcRowset.clearParameters();
//			
//			System.out.println("inserting a new record \n \n");
//			jdbcRowset.moveToInsertRow();
//			jdbcRowset.updateInt("student_id", 388);
//			jdbcRowset.updateString("first_name", "jaymes");
//			jdbcRowset.updateString("last_name", "duke");
//			jdbcRowset.updateString("date_of_birth", "1999-01-30");
//			jdbcRowset.updateString("enrollment_date", "2022-12-06");
//			jdbcRowset.updateString("Session_name", "physics");
//			jdbcRowset.insertRow();
//			
			
//			System.out.println("updating an existing record \n \n");
//					jdbcRowset.clearParameters();
//					jdbcRowset.absolute(10);
//					jdbcRowset.moveToCurrentRow();
//					jdbcRowset.updateString("first_name", "pullarao");
//					jdbcRowset.updateString("last_name", "garu");
//					jdbcRowset.updateString("first_name", "pullarao");
//					jdbcRowset.updateRow();
//
//					System.out.println("deleting an existing record \n \n");
//					jdbcRowset.clearParameters();
//					jdbcRowset.absolute(10);
//					jdbcRowset.moveToCurrentRow();
//					jdbcRowset.deleteRow();
//					
//					jdbcRowset.clearParameters();
//					jdbcRowset.afterLast();
//					while(jdbcRowset.previous()) {
//						rowCount++;
//				
//					jdbcRowset.deleteRow();
//					if(rowCount==2)
//						break;
//					}
		} catch (SQLException e) {
			System.out.println(e.getErrorCode());
			e.printStackTrace();
		}
	}
}
