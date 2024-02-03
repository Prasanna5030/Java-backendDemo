package com.jbdc.rowset;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class WebRowSetDemo {
	public static void main(String[] args) {
//		dbtoWebRowSet();
		xmltoWebRowSet();
	}

	public static void xmltoWebRowSet() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			WebRowSet webRowSet = RowSetProvider.newFactory().createWebRowSet();
			webRowSet.readXml(new FileReader("C:\\Users\\HP\\Java Backend\\src\\students.xml"));
			
			while(webRowSet.next()) {
                 int id= webRowSet.getInt("student_id");
				
				String first_name= webRowSet.getString("first_name");
				String last_name= webRowSet.getString("last_name");
				Date date_of_birth= webRowSet.getDate("date_of_birth");
				Date enrollment_date= webRowSet.getDate("enrollment_date");
				String session_name= webRowSet.getString("session_name");
				System.out.println("Id : "+id+" first name : "+first_name+" last_name :"+last_name+" date_of_birth : "+date_of_birth+" enrollment_date : "+enrollment_date +" session_name : "+session_name);		}
			
			System.out.println("\n\n ");
			System.out.println("fetching selected row \n");
			webRowSet.absolute(4);
			 int id= webRowSet.getInt("student_id");
				
				String first_name= webRowSet.getString("first_name");
				String last_name= webRowSet.getString("last_name");
				Date date_of_birth= webRowSet.getDate("date_of_birth");
				Date enrollment_date= webRowSet.getDate("enrollment_date");
				String session_name= webRowSet.getString("session_name");
				System.out.println("Id : "+id+" first name : "+first_name+" last_name :"+last_name+" date_of_birth : "+date_of_birth+" enrollment_date : "+enrollment_date +" session_name : "+session_name);
			
				System.out.println("Inserting new record \n");
				webRowSet.clearParameters();
				webRowSet.afterLast();
				webRowSet.moveToInsertRow();
				webRowSet.updateInt("student_id", 321);
				webRowSet.updateString("first_name","bob");
				webRowSet.updateString("last_name","marley");
				webRowSet.updateString("date_of_birth","1998-09-01");
				webRowSet.updateString("enrollment_date","2020-10-09");
				webRowSet.updateString("Session_name","physics");
				webRowSet.insertRow();
		} catch (SQLException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void dbtoWebRowSet() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			WebRowSet webRowSet= RowSetProvider.newFactory().createWebRowSet();
			webRowSet.setUrl("jdbc:mysql://localhost:3306/cms");
			webRowSet.setUsername("root");
			webRowSet.setPassword("Prasanna@5030");
			webRowSet.setCommand("SELECT * FROM STUDENTS");
			webRowSet.execute();
			webRowSet.writeXml(new FileWriter("C:\\Users\\HP\\Java Backend\\src\\students.xml"));
		
		} catch (SQLException e) {
			System.out.println(e.getErrorCode());
			System.out.println(e.getNextException());
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
