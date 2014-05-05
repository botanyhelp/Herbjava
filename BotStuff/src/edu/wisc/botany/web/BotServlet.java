package edu.wisc.botany.web;
///////////////////////////////////////////////////////////////////////////////
//Title:            BotServlet.java
//Files:            BotServlet.java
//
//Author:           Thomas Maher
//
//Credits:          
////////////////////////////80 columns wide //////////////////////////////////



import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class BotServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//test servlet operation...make sure there's a web.xml entry for this and go to:
		//http://127.0.0.1:8180/BotStuff/botservlet or whereever it is
		PrintWriter out = response.getWriter();
		out.println("<html>\n" );
		out.println("<head><title>botservlet</title></head>\n" );
		out.println("<body>\n" );
		out.println("<h1>botservlet 2 works!</h1>\n" );
		out.println("</body></html>");
	}
}
