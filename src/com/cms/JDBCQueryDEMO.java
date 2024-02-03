package com.cms;

import java.sql.*;

public class JDBCQueryDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection =null ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("");
		}
		

	}

}
