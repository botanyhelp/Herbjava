package edu.wisc.botany.model; 
///////////////////////////////////////////////////////////////////////////////
//Title:            JdbcConnTest.java
//Files:            JdbcConnTest.java
//
//Author:           Thomas Maher
//
//Credits:          
////////////////////////////80 columns wide //////////////////////////////////
//JdbcConnTest has a main() that tests JdbcConn ability to return a Connection
//Test like this from command line:
// java edu/wisc/botany/model/JdbcConnTest
// ...it should return six records.

import edu.wisc.botany.model.*;
import java.sql.*;
import java.io.*;

public class JdbcConnTest {
	public static void main(String[] argv) {
		JdbcConn jc = new JdbcConn();
		Connection conn = jc.getJdbcConn();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs;
			rs = stmt.executeQuery("Select Taxcd, COFC from spdetail LIMIT 6");
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
	
