package edu.wisc.botany.web;

///////////////////////////////////////////////////////////////////////////////
//Title:            VarLogMessagesTester.java
//Files:            VarLogMessagesTester.java
//
//Author:           Thomas Maher
//
//Credits:          
////////////////////////////80 columns wide //////////////////////////////////
//VarLogMessagesTester has a main() and can be used to test operation from cmd line:
// cd /usr/share/tomcat5.5/webapps/BotStuff/WEB-INF/classes
// java edu/wisc/botany/web/VarLogMessagesTester
// ...which should show you the last few lines of the messages log on this system
// ...notice that this is NOT a servlet!

import edu.wisc.botany.util.*;

import java.io.*;
 
public class VarLogMessagesTester {
	public static void main(String[] argv) throws IOException {
			String[] cmd = new String[3];
			cmd[0] = "sudo";
			cmd[1] = "tail";
			cmd[2] = "/var/log/messages";
			CommandRunnerThree crt = new CommandRunnerThree(cmd);
			String output = crt.runCmd();
			System.out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " );
			System.out.println("Transitional//EN\">\n" );
			System.out.println("<html>\n" );
			System.out.println("<head><title>log tester</title></head>\n" );
			System.out.println("<body>\n" );
			System.out.println("<h1>botservlet 2 works!</h1>\n" );
			System.out.println("<pre>" + output + "</pre>\n" );
			System.out.println("</body></html>");
	}
}
