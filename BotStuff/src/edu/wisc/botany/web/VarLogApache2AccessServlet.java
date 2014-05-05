package edu.wisc.botany.web;

///////////////////////////////////////////////////////////////////////////////
//Title:            VarLogApache2AccessServlet.java
//Files:            VarLogApache2AccessServlet.java
//
//Author:           Thomas Maher
//
//Credits:          
////////////////////////////80 columns wide //////////////////////////////////


import edu.wisc.botany.util.*;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Notice that getting tomcat to run OS commands is not smart!
//To do so:
//1. Turn off Tomcat security manager (this can be done by replacing SecurityManager class with empty method bodies or
//   by heavily editing catatlina.policy)
//2. Use vigr to add tomcat user (tomcat55) to sudo group, make line in /etc/group like this:
//sudo:x:27:tomcat55
//3. Use visudo to edit /etc/sudoers and allow all sudo group members to not need to type a  password, add line like this:
//%sudo ALL=NOPASSWD: ALL
//4. At this point, the tomcat process, running as user tomcat55, can run sudo without a password 
//5. Notice that tomcat can run 'rm -rf /'

 
public class VarLogApache2AccessServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Hardcode the command tomcat will run:
		String[] cmd = new String[3];
		cmd[0] = "sudo";
		cmd[1] = "tail -50";
		cmd[2] = "/var/log/apache2/access.log";
		CommandRunnerThree crt = new CommandRunnerThree(cmd);
		String output = crt.runCmd();
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " );
		out.println("Transitional//EN\">\n" );
		out.println("<html>\n" );
		out.println("<head><title>Apache 2 access log</title></head>\n" );
		out.println("<body>\n" );
		out.println("<h1>Apache 2 access log </h1>\n" );
		out.println("<pre>" + output + "</pre>\n" );
		out.println("</body></html>");
	}
}
