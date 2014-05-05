package edu.wisc.botany.util;

///////////////////////////////////////////////////////////////////////////////
//Title:            CommandRunnerThree.java
//Files:            CommandRunnerThree.java
//
//Author:           Thomas Maher
//
//Credits:          
////////////////////////////80 columns wide //////////////////////////////////
//CommandRunnerThree objects are made to run misc. system commands.
//After making a CommandRunnerThree by passing in a String[] with the command 
//  line in each cell, the command line is constructed from the args.  
//  When you call the objects runCmd() method, the command is run by the 
//  system and its output is captured as a String and returned.  
//CommandRunnerThree has a tester main(), use it like this:
// java edu/wisc/botany/util/CommandRunnerThree ls /tmp/
// ..to list the contents of the /tmp directory
// java edu/wisc/botany/util/CommandRunnerThree tail /var/log/messages
// ..to show the latest log entries

import java.io.*;
import edu.wisc.botany.util.*;


public class CommandRunnerThree {
	//hold the command string, should be final
	String PROG;
	//true ends the loop
	boolean finished = false;
	//cmd string
	String cmd = "";

	//test in main
	//duck IOException
	public static void main(String argv[]) throws IOException {
		CommandRunnerThree crt = new CommandRunnerThree(argv);
		String result = crt.runCmd();
		System.out.println("ok");
		System.out.println(result);
		System.out.println("ok");
	}
	public CommandRunnerThree(String argv[]) {
		for (String s: argv) {
			cmd += s;
			cmd += " ";
		}
		PROG = cmd;
	}

	public String runCmd() throws IOException {
		String res = "Command:" + cmd + "\n";
		final Process p;
		BufferedReader is;
		String line;
		p = Runtime.getRuntime().exec(PROG);
		Thread waitThread = new Thread() {
			public void run() {
				try {
					p.waitFor();
				} catch (InterruptedException ex) {
					//BAD, quit.
					return;
				}
				//System.out.println("PROG ended");
				finished = true;
			}
		};
		waitThread.start();

		// getInputStream connected to the proc's stdout and read it
		is = new BufferedReader(new InputStreamReader(p.getInputStream()));
		while (!finished && ((line = is.readLine()) != null)) {
			res += line;
			res += "\n";
		}
		return res;
	}
}
