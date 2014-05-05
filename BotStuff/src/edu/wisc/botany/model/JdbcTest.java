package edu.wisc.botany.model;
///////////////////////////////////////////////////////////////////////////////
//Title:            JdbcTest.java
//Files:            JdbcTest.java
//
//Author:           Thomas Maher
//
//Credits:          
////////////////////////////80 columns wide //////////////////////////////////
//JdbcTest connects to the database and queries 3 records.
//Its got a main() used like this:
// java edu/wisc/botany/model/JdbcTest
//Be sure to check your DB, User and Pass entries.   
//Lots of mysql things need to be right, including that user www-data has to have read access to herbXYZ
//This uses the jdbc driver for mysql. 

import java.sql.*;

public class JdbcTest {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/herbfifty", "www-data", "apachePASS");
			Statement stmt = conn.createStatement();
			ResultSet rs;
			rs = stmt.executeQuery("Select Taxcd, COFC from spdetail LIMIT 3");
			while(rs.next()) { 
				//Taxcd is a String and COFC is an INT
				System.out.println(rs.getString(1));
				System.out.println(rs.getInt(2));
			}
			conn.close();
		}catch(Exception e) {
			System.out.println("oops" + e.getMessage());
		}
	}
}
