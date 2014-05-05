package edu.wisc.botany.web;
///////////////////////////////////////////////////////////////////////////////
//Title:            SpdetailServletTwo.java
//Files:            SpdetailServletTwo.java
//
//Author:           Thomas Maher
//
//Credits:          
////////////////////////////80 columns wide //////////////////////////////////

import edu.wisc.botany.util.*;
import edu.wisc.botany.model.*;
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class SpdetailServletTwo extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//test servlet operation...make sure there's a web.xml entry for this and go to:
		//http://127.0.0.1:8180/BotStuff/botservlet or whereever it is
		PrintWriter out = response.getWriter();
		out.println("<html>\n" );
		out.println("<head><title>spdetail table data</title></head>\n" );
		out.println("<body>\n" );
		out.println("<h1>spdetail table data</h1>\n" );

		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/herbfifty", "www-data", "apachePASS");
		}catch(Exception e) {
			out.println("oops" + e.getMessage());
		}

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs;
			//String q = "SELECT Taxcd, COFC FROM spdetail LIMIT 7";
			//rs = stmt.executeQuery(q);
			stmt.executeQuery("SELECT Taxcd, COFC FROM spdetail LIMIT 7");
			rs = stmt.getResultSet();
			while(rs.next()) { 
				//Taxcd is a String and COFC is an INT
				out.println(rs.getString(1));
				out.println(rs.getInt(2));
			}
			conn.close();
		}catch(Exception e) {
			out.println("oops" + e.getMessage());
		}


		out.println("</body></html>");
	}
}
