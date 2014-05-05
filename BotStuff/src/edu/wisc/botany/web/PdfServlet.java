package edu.wisc.botany.web;	      
///////////////////////////////////////////////////////////////////////////////
//Title:	       PdfServlet.java
//Files:	       PdfServlet.java
//
//Author:	      Thomas Maher
//
//Credits:	     
////////////////////////////80 columns wide //////////////////////////////////

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class PdfServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//this is where we'll write the pdf contents to:
	ServletOutputStream stream = null;
	//buffered of course
	BufferedInputStream buf = null;
	try{
		stream = response.getOutputStream();
		//get the dir and fileName from wherever you want like query params, here we hardcode
		String dir = "/";
		String fileName = "Peach.pdf";
		File pdf = new File(dir + fileName);
	 	//set headers to pdf so that acrobat gets launched by browser
	 	response.setContentType("application/pdf");

		 //set headers to pdf so that acrobat gets launched by browser
		 response.addHeader("Content-Disposition","attachment; filename="+fileName );

		//set content length header so browser knows how much to read
		response.setContentLength( (int) pdf.length() );
		 
		//read in the file specified above.
		FileInputStream input = new FileInputStream(pdf);
		buf = new BufferedInputStream(input);
		int readBytes = 0;
	
		//read from the file; write to ServletOutputStream
		while((readBytes = buf.read()) != -1){
		   stream.write(readBytes);
		}
	} catch (IOException ioe){
	   throw new ServletException(ioe.getMessage());
	} finally {
		//close the output stream
		if(stream != null){
			stream.close();
		}
		//close the input stream
		if(buf != null){
			buf.close();
		}
	}
    
} //end 

public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//we only do doGet
	doGet(request,response);
} 
}
