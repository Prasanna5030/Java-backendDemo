package com.jbdc.rowset;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/cms";
		String username="root";
		String password="Prasanna@5030";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try(Connection connection = DriverManager.getConnection(url,username, password)) {
			connection.setAutoCommit(false);
			CachedRowSet cachedRowset = RowSetProvider.newFactory().createCachedRowSet();
			cachedRowset.setUrl("jdbc:mysql://localhost:3306/cms");
			cachedRowset.setUsername("root");
			cachedRowset.setPassword("Prasanna@5030");
			
			cachedRowset.setCommand("SELECT * FROM STUDENTS");
			
			cachedRowset.execute();
		
			while(cachedRowset.next()) {
				int id= cachedRowset.getInt("student_id");
				
				String first_name= cachedRowset.getString("first_name");
				String last_name= cachedRowset.getString("last_name");
				Date date_of_birth= cachedRowset.getDate("date_of_birth");
				Date enrollment_date= cachedRowset.getDate("enrollment_date");
				String session_name= cachedRowset.getString("session_name");
				System.out.println("Id : "+id+" first name : "+first_name+" last_name :"+last_name+" date_of_birth : "+date_of_birth+" enrollment_date : "+enrollment_date +" session_name : "+session_name);		}
		
			
			System.out.println(" \n \n ");
			System.out.println(" Fetch a row no 10\n ");
			
//			cachedRowset.absolute(10);
//			int id= cachedRowset.getInt("student_id");
//			String first_name= cachedRowset.getString("first_name");
//			String last_name= cachedRowset.getString("last_name");
//			Date date_of_birth= cachedRowset.getDate("date_of_birth");
//			Date enrollment_date= cachedRowset.getDate("enrollment_date");
//			String session_name= cachedRowset.getString("session_name");
//			System.out.println("Id : "+id+" first name : "+first_name+" last_name :"+last_name+" date_of_birth : "+date_of_birth+" enrollment_date : "+enrollment_date +" session_name : "+session_name);		
//			
			System.out.println(" \n \n ");
			System.out.println(" Fetching database afterlast rows from the table i.e, afterLast() \n "); 
			cachedRowset.afterLast();
			int rowCount=0;
			while(cachedRowset.previous()) {
				rowCount++;
			int id= cachedRowset.getInt("student_id");
			String first_name= cachedRowset.getString("first_name");
			String last_name= cachedRowset.getString("last_name");
			Date date_of_birth= cachedRowset.getDate("date_of_birth");
			Date enrollment_date= cachedRowset.getDate("enrollment_date");
			String session_name= cachedRowset.getString("session_name");
			System.out.println("Id : "+id+" first name : "+first_name+" last_name :"+last_name+" date_of_birth : "+date_of_birth+" enrollment_date : "+enrollment_date +" session_name : "+session_name);		
			if(rowCount==10)
				break;
			}
			cachedRowset.clearParameters();
			
			System.out.println("inserting a new record \n \n");
			cachedRowset.afterLast();
			cachedRowset.moveToInsertRow();
			cachedRowset.updateInt("student_id", 308);
			cachedRowset.updateString("first_name", "tessa");
			cachedRowset.updateString("last_name", "brooks");
			cachedRowset.updateString("date_of_birth", "1974-01-20");
			cachedRowset.updateString("enrollment_date", "2013-12-26");
			cachedRowset.updateString("Session_name", "chemistry");
			cachedRowset.insertRow();
			cachedRowset.moveToCurrentRow();
			
			System.out.println("updating an existing record \n \n");
					cachedRowset.clearParameters();
		
					cachedRowset.absolute(5);
					cachedRowset.moveToCurrentRow();
					cachedRowset.updateString("first_name", "Juann");
					cachedRowset.updateString("last_name", "carey");
					cachedRowset.updateRow();
					cachedRowset.acceptChanges(connection);
					cachedRowset.commit();
					
//
//					System.out.println("deleting an existing record \n \n");
//					cachedRowset.clearParameters();
//					cachedRowset.absolute(10);
//					cachedRowset.moveToCurrentRow();
//					cachedRowset.deleteRow();
//					

		} catch (SQLException e) {
			System.out.println(e.getErrorCode());
			e.printStackTrace();
		}
	}

	}


