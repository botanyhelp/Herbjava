package edu.wisc.botany.web;
///////////////////////////////////////////////////////////////////////////////
//Title:            CommonServlet.java
//Files:            CommonServlet.java
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

 
public class CommonServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>\n" );
		out.println("<head><title>Vascular Plants Common Names</title></head>\n" );
		out.println("<body>\n" );
		out.println("<h1>Vascular Plants Common Names</h1>\n" );

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
			String q = "SELECT DISTINCT common FROM t_vascular_common_names WHERE common IS NOT NULL and WiscFound = 'W' ORDER BY common";
			rs = stmt.executeQuery(q);
			while(rs.next()) { 
				//common is  a String
				String common = rs.getString(1);
				out.println("<a href=\"/BotStuff/searchresultsservlet?common=");
				out.println(common);
				out.println("\">");
				out.println(common);
				out.println("</a><br>");
			}
			conn.close();
		}catch(Exception e) {
			out.println("oops" + e.getMessage());
		}


		out.println("</body></html>");
	}
}
