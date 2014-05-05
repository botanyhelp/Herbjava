package edu.wisc.botany.web;
///////////////////////////////////////////////////////////////////////////////
//Title:            GenusServlet.java
//Files:            GenusServlet.java
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

 
public class GenusServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>\n" );
		out.println("<head><title>Vascular Plants Genus Names</title></head>\n" );
		out.println("<body>\n" );
		out.println("<h1>Vascular Plants Genus Names</h1>\n" );

		JdbcConn jc = null;
		jc = new JdbcConn();
		Connection conn = null;
		conn = jc.getJdbcConn();
		if (conn == null){ 
			out.println("null conn");
		}

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs;
			String q = "SELECT DISTINCT Genus FROM spdetail WHERE syncd = '.' and Wisc_found = 'W' ORDER BY Genus";
			rs = stmt.executeQuery(q);
			while(rs.next()) { 
				//genus is  a String
				String genus = rs.getString(1);
				out.println("<a href=\"/BotStuff/searchresultsservlet?Genus=");
				out.println(genus);
				out.println("\">");
				out.println(genus);
				out.println("</a><br>");
			}
			conn.close();
		}catch(Exception e) {
			out.println("oops" + e.getMessage());
		}


		out.println("</body></html>");
	}
}
