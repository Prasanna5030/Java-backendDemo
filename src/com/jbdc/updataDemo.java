package com.jbdc;
import java.sql.*;
import java.util.Scanner;
public class updataDemo {
	public static void main(String[] args) {
//		statementUpdate();
		PreparedStatementUpdate();
	}

	public static void PreparedStatementUpdate() {
		//updating using prepared statement
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root", "Prasanna@5030");
			

			 PreparedStatement pstmt = connection.prepareStatement("UPDATE STUDENTS SET first_name = ? , last_name= ?  WHERE student_id= ? ");
			 
			 Scanner sc= new Scanner(System.in);
			 
			 while(true) {
				 System.out.println(" enter id of student to which need to be updated");
				 int id = sc.nextInt();
				 System.out.println(" enter new first name of student to update");
				 String firstname= sc.next();
				 System.out.println(" enter new last name of student to update");
				 String lastname= sc.next();
				 
				 pstmt.setString(1, firstname);
				 pstmt.setString(2, lastname);
				 pstmt.setInt(3, id);
				 
				 
				 
				 int i = pstmt.executeUpdate();
				 
				 System.out.println("updated" +i+"row(s) succesfully");

				 System.out.println("want to update another record ? yes or no");
				 String answer = sc.next();
				 if(!answer.equalsIgnoreCase("yes"))
					 break;			 
			 }
			 
			 sc.close();
			 
		 }catch(ClassNotFoundException | SQLException e) {
			 e.printStackTrace();
		 }

		
	}

	public static void statementUpdate() {
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root", "Prasanna@5030");
		
		 Statement stmt = connection.createStatement();
		 
		 Scanner sc= new Scanner(System.in);
		 
		 while(true) {
			 System.out.println(" enter id of student to which need to be updated");
			 int id = sc.nextInt();
			 System.out.println(" enter new first name of student to update");
			 String firstname= sc.next();
			 System.out.println(" enter new last name of student to update");
			 String lastname= sc.next();
			 
//			 String sqlCommand = "UPDATE STUDENTS SET first_name='" +first_name +  "' where student_id="+ id;
			
//			 String query="UPDATE STUDENTS "+"SET first_name='"+ firstname+ "'  , last name= '"+lastname+"' where student_id =+'";
			 
			 StringBuffer sb= new StringBuffer();
			 sb.append("UPDATE STUDENTS SET first_name='");
			 sb.append(firstname);
			 sb.append("', last_name='");
			 sb.append(lastname);
			 sb.append("' WHERE student_id=");
			 sb.append(id);
			 
			 String query= sb.toString();
//			 System.out.println(query);
			 
			 
			 int i = stmt.executeUpdate(query);
			 
			 System.out.println("updated" +i+"row(s) succesfully");

			 System.out.println("want to update another record ? yes or no");
			 String answer = sc.next();
			 if(!answer.equalsIgnoreCase("yes"))
				 break;			 
		 }
		 
		 sc.close();
		 
	 }catch(ClassNotFoundException | SQLException e) {
		 e.printStackTrace();
	 }

	}

}
