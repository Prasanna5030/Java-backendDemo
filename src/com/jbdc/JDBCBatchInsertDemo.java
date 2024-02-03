package com.jbdc;
import java.sql.*;
import java.util.*;
public class JDBCBatchInsertDemo {

	public static void main(String[] args) {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/cms" ,"root", "Prasanna@5030");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
try {
	connection.setAutoCommit(false);
	PreparedStatement pstmt= connection.prepareStatement("INSERT INTO STUDENTS VALUES(?,?,?,?,?,?)");
	Scanner sc = new Scanner(System.in);
	
	while(true) {
	System.out.println("Enter id :");
	int id = sc.nextInt();
	
	System.out.println("Enter firstname :");
	String first_name= sc.next();
	
	System.out.println("Enter lastname :");
	String last_name= sc.next();
	System.out.println("Enter Date of birth :");
	String date_of_birth= sc.next();
	System.out.println("Enter enrollment date :");
	String enrollment_date= sc.next();
	System.out.println("Enter session name :");
	String session_name= sc.next();
	
	pstmt.setInt(1, id);
	pstmt.setString(2, first_name);
	pstmt.setString(3, last_name);
	pstmt.setString(4, date_of_birth);
	pstmt.setString(5, enrollment_date);
	pstmt.setString(6, session_name);
	
	pstmt.addBatch();
	
	System.out.println("insert another records ? 'Yes' or 'No'");
	String answer= sc.next();
	if(!answer.equalsIgnoreCase("yes"))
		break;
	}
	int[] result=pstmt.executeBatch();
	connection.commit();
	pstmt.clearBatch();
	System.out.println("Inserted"+Arrays.toString(result)+ "row(s) sucessfully");
	sc.close();
	
}catch(Exception e){5
	
}
	}

}
