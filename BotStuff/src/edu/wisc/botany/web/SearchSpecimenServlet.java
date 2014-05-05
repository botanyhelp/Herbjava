package edu.wisc.botany.web;
///////////////////////////////////////////////////////////////////////////////
//Title:            SearchSpecimenServlet.java
//Files:            SearchSpecimenServlet.java
//
//Author:           Thomas Maher
//
//Credits:          
////////////////////////////80 columns wide //////////////////////////////////

import edu.wisc.botany.util.*;
import edu.wisc.botany.model.*;
import java.sql.*;
import java.util.*;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class SearchSpecimenServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>\n" );
		out.println("<head><title>Vascular Plants SpecimenSearch </title></head>\n" );
		out.println("<body>\n" );
		out.println("<h1>Vascular Plants SpecimenSearch </h1>\n" );

		JdbcConn jc = null;
		jc = new JdbcConn();
		Connection conn = null;
		conn = jc.getJdbcConn();
		if (conn == null){ 
			out.println("null conn");
		}
		//get the family param:
		String taxcdParam = request.getParameter("Taxcd");
		out.println("The taxcd is ");
		out.println(taxcdParam);

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs;
			String q = "SELECT ACCESSION, TYPE, COLLDATE, FLOWER, FRUIT, STERILE, OBJTYPE, INST, ANNCODE, ANNDATE, ANNSOURCE, CITY, CITYTYPE, COLL2NAME, COLL3NAME, COLL1NAME, COLLNO1, COLLEVENT, TAXCD, CFS, CFV, CFVariety, LONGX, LAT, ELEV, LLGENER, LONG2, LAT2, NOWLOC, LOAN, ORIGCD, PUBCD, LITCIT, PUBDATE, PUBDATEA, VERPERS, VERDATE, EX, ARTICLE, PREC, STATEL, COUNTY, COUNTRY, T1, R1, S1, NSEW_1, TRSGENER, T2, R2, S2, NSEW_2, PLACE, MAPFILE, username FROM specimen WHERE TAXCD = '";
			q += taxcdParam;
			q += "'";
			rs = stmt.executeQuery(q);
			ArrayList<Specimen> alt = new ArrayList<Specimen>();
			while(rs.next()) { 
				//taxcd is  a String
				int i = 1;
				String ACCESSION = rs.getString(i); i++;
				String TYPE = rs.getString(i); i++;
				String COLLDATE = rs.getString(i); i++;
				String FLOWER = rs.getString(i); i++;
				String FRUIT = rs.getString(i); i++;
				String STERILE = rs.getString(i); i++;
				String OBJTYPE = rs.getString(i); i++;
				String INST = rs.getString(i); i++;
				String ANNCODE = rs.getString(i); i++;
				String ANNDATE = rs.getString(i); i++;
				String ANNSOURCE = rs.getString(i); i++;
				String CITY = rs.getString(i); i++;
				String CITYTYPE = rs.getString(i); i++;
				String COLL2NAME = rs.getString(i); i++;
				String COLL3NAME = rs.getString(i); i++;
				String COLL1NAME = rs.getString(i); i++;
				String COLLNO1 = rs.getString(i); i++;
				String COLLEVENT = rs.getString(i); i++;
				String TAXCD = rs.getString(i); i++;
				String CFS = rs.getString(i); i++;
				String CFV = rs.getString(i); i++;
				String CFVariety = rs.getString(i); i++;
				String LONGX = rs.getString(i); i++;
				String LAT = rs.getString(i); i++;
				String ELEV = rs.getString(i); i++;
				String LLGENER = rs.getString(i); i++;
				String LONG2 = rs.getString(i); i++;
				String LAT2 = rs.getString(i); i++;
				String NOWLOC = rs.getString(i); i++;
				String LOAN = rs.getString(i); i++;
				String ORIGCD = rs.getString(i); i++;
				String PUBCD = rs.getString(i); i++;
				String LITCIT = rs.getString(i); i++;
				String PUBDATE = rs.getString(i); i++;
				String PUBDATEA = rs.getString(i); i++;
				String VERPERS = rs.getString(i); i++;
				String VERDATE = rs.getString(i); i++;
				String EX = rs.getString(i); i++;
				String ARTICLE = rs.getString(i); i++;
				String PREC = rs.getString(i); i++;
				String STATEL = rs.getString(i); i++;
				String COUNTY = rs.getString(i); i++;
				String COUNTRY = rs.getString(i); i++;
				String T1 = rs.getString(i); i++;
				String R1 = rs.getString(i); i++;
				String S1 = rs.getString(i); i++;
				String NSEW_1 = rs.getString(i); i++;
				String TRSGENER = rs.getString(i); i++;
				String T2 = rs.getString(i); i++;
				String R2 = rs.getString(i); i++;
				String S2 = rs.getString(i); i++;
				String NSEW_2 = rs.getString(i); i++;
				String PLACE = rs.getString(i); i++;
				String MAPFILE = rs.getString(i); i++;
				String username = rs.getString(i); i++;

				Specimen t = new Specimen(ACCESSION, TYPE, COLLDATE, FLOWER, FRUIT, STERILE, OBJTYPE, INST, ANNCODE, ANNDATE, ANNSOURCE, CITY, CITYTYPE, COLL2NAME, COLL3NAME, COLL1NAME, COLLNO1, COLLEVENT, TAXCD, CFS, CFV, CFVariety, LONGX, LAT, ELEV, LLGENER, LONG2, LAT2, NOWLOC, LOAN, ORIGCD, PUBCD, LITCIT, PUBDATE, PUBDATEA, VERPERS, VERDATE, EX, ARTICLE, PREC, STATEL, COUNTY, COUNTRY, T1, R1, S1, NSEW_1, TRSGENER, T2, R2, S2, NSEW_2, PLACE, MAPFILE, username);
				//Comment the above custom Specimen construction with the next-line no-arg Specimen construct
				// Using the predictable no-arg constructor can help with bad DB data
				//Specimen t = new Specimen();
				alt.add(t);
			}
			out.println("<br><b>" + alt.size() + " specimen records returned for this taxon</b><br>");
			out.println("<br>This specimen results page is shown in production at <a href=\"http://www.botany.wisc.edu/cgi-bin/searchspecimen.cgi?SpCode=" + taxcdParam + "\">" + taxcdParam+ "</a><br><br>");
			for (int i = 0; i < alt.size(); i++) {
				Specimen t = (Specimen) alt.get(i);
				//if (t.isType()) {
				if (true) {
					out.println("<a href=\"/BotStuff/specimenservlet?ACCESSION=");
					out.println(t.getACCESSION());
					out.println("\">");
				}
				for(String prop: t.getAll()) {
					out.println("-&nbsp;");
					out.println(prop);
					if (prop.length() > 0) {
						out.println("--&nbsp;");
					}
				}
				//if (t.isType()){
				if (true){
					out.println("</a>");
				}
				out.println("<hr>");
			}
			out.println("<hr>");
			out.println("<hr>");
			conn.close();
		}catch(Exception e) {
			out.println("oopsbot " + e.getMessage());
		}//end catch
		

		out.println("</body></html>");
	}//end doGet
}//end class
