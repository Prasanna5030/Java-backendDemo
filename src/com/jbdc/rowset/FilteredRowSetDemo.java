package com.jbdc.rowset;
import java.sql.*;

import javax.sql.RowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.Predicate;
import javax.sql.rowset.RowSetProvider;


class sessionFilter implements Predicate{

	@Override
	public boolean evaluate(RowSet rs) {
		
		try {
			return rs.getString("Session_name").equals("maths");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean evaluate(Object value, int column) throws SQLException {
	
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean evaluate(Object value, String columnName) throws SQLException {
	
		throw new UnsupportedOperationException();
	}
	
}
public class FilteredRowSetDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			FilteredRowSet filterRowSet= RowSetProvider.newFactory().createFilteredRowSet();
			filterRowSet.setUrl("jdbc:mysql://localhost:3306/cms");
			filterRowSet.setUsername("root");
			filterRowSet.setPassword("root@sql21");
			filterRowSet.setCommand("select * from students");
			filterRowSet.execute();
			
			while(filterRowSet.next()) {
				int id= filterRowSet.getInt("student_id");
				
				String first_name= filterRowSet.getString("first_name");
				String last_name= filterRowSet.getString("last_name");
				Date date_of_birth= filterRowSet.getDate("date_of_birth");
				Date enrollment_date= filterRowSet.getDate("enrollment_date");
				String session_name= filterRowSet.getString("session_name");
				System.out.println("Id : "+id+" first name : "+first_name+" last_name :"+last_name+" date_of_birth : "+date_of_birth+" enrollment_date : "+enrollment_date +" session_name : "+session_name);		}
		
			System.out.println("\n \n");
			
			
			System.out.println("Fetching filtered rows : ");
			filterRowSet.beforeFirst();
			filterRowSet.setFilter(new sessionFilter());
			while(filterRowSet.next()) {
			int id= filterRowSet.getInt("student_id");
			
			String first_name= filterRowSet.getString("first_name");
			String last_name= filterRowSet.getString("last_name");
			Date date_of_birth= filterRowSet.getDate("date_of_birth");
			Date enrollment_date= filterRowSet.getDate("enrollment_date");
			String session_name= filterRowSet.getString("session_name");
			System.out.println("Id : "+id+" first name : "+first_name+" last_name :"+last_name+" date_of_birth : "+date_of_birth+" enrollment_date : "+enrollment_date +" session_name : "+session_name);		
		}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
