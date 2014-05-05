package edu.wisc.botany.model;
///////////////////////////////////////////////////////////////////////////////
//Title:            JdbcConn.java
//Files:            JdbcConn.java
//
//Author:           Thomas Maher
//
//Credits:          
////////////////////////////80 columns wide //////////////////////////////////
// JdbcConn objects have method getJdbcConn() that returns a Connection object


import java.sql.*;

public class JdbcConn {
	public Connection getJdbcConn() {
		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/herbfifty", "www-data", "apachePASS");
		}catch(Exception e) {
			System.out.println("oops" + e.getMessage());
		}
		return conn;
	}
}

