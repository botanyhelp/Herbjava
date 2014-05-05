package edu.wisc.botany.web;
///////////////////////////////////////////////////////////////////////////////
//Title:            SearchResultsServlet.java
//Files:            SearchResultsServlet.java
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

 
public class SearchResultsServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>\n" );
		out.println("<head><title>Vascular Plants SearchResults Names</title></head>\n" );
		out.println("<body>\n" );
		out.println("<h1>Vascular Plants SearchResults Names</h1>\n" );

		JdbcConn jc = null;
		jc = new JdbcConn();
		Connection conn = null;
		conn = jc.getJdbcConn();
		if (conn == null){ 
			out.println("null conn");
		}

		try {
			String q = "";
			//get the family param:
			String familyParam = request.getParameter("Family");
			if(familyParam != null) {
				out.println("The family is ");
				out.println(familyParam);
				q = "SELECT DISTINCT Taxcd FROM spdetail WHERE family LIKE '";
				q += familyParam;
			}
			//get the genus param:
			String genusParam = request.getParameter("Genus");
			if(genusParam != null) {
				out.println("The genus is ");
				out.println(genusParam);
				q = "SELECT DISTINCT Taxcd FROM spdetail WHERE genus LIKE '";
				q += genusParam;
			}
			//get the common param:
			String commonParam = request.getParameter("common");
			if(commonParam != null) {
				out.println("The common name is ");
				out.println(commonParam);
				q = "SELECT DISTINCT Taxcd FROM spdetail WHERE common LIKE '";
				q += commonParam;
			}
				
			Statement stmt = conn.createStatement();
			ResultSet rs;
			//String q = "SELECT DISTINCT Taxcd FROM spdetail WHERE family LIKE '";
			q += "%'";
			rs = stmt.executeQuery(q);
			ArrayList<String> als = new ArrayList<String>();
			while(rs.next()) { 
				//taxcd is  a String
				String taxcd = rs.getString(1);
				als.add(taxcd);
			}
			ResultSet rs2;
			String q2 = "SELECT taxcd, syncd, genus, family, species, common, status_code, photo, thumbmaps, hand, Wisc_found FROM spdetail WHERE Taxcd IN (";

			for (int i = 0; i < als.size(); i++) {
				q2 += "\"";
				q2 += (String) als.get(i);
				q2 += "\" ";
				if((i+1) < als.size()) {
					q2 += ",";
				}
			}
			q2 +=") ORDER BY family, taxcd, syncd";
			out.println("<br>The query sent to the DB is:<br>");
			out.println(q2);
			//q2 is a String holding a query like this:
			//SELECT taxcd, syncd, genus, family, species, common, status_code, photo, thumbmaps, hand, Wisc_found 
			//  FROM spdetail WHERE Taxcd IN ("BERAQU" ,"BERCAN" ,"BERDIV" ,"BERPAU") ORDER BY family, taxcd, syncd
			rs = stmt.executeQuery(q2);
			ArrayList<Taxon> alt = new ArrayList<Taxon>();
			String curTaxcd = "";
			while(rs.next()) { 
				//taxcd is  a String
				String taxcd = rs.getString(1);
				curTaxcd = taxcd;
				String syncd = rs.getString(2);
				String genus = rs.getString(3);
				String family = rs.getString(4);
				String species = rs.getString(5);
				String common = rs.getString(6);
				String status_code = rs.getString(7);
				String photo = rs.getString(8);
				String thumbmaps = rs.getString(9);
				String hand = rs.getString(10);
				String Wisc_found = rs.getString(11);

				//Uncomment to debug database values:
				//out.println(taxcd);
				//out.println(syncd);
				//out.println(genus);
				//out.println(family);
				//out.println(species);
				//out.println(common);
				//out.println(status_code);
				//out.println(photo);
				//out.println(thumbmaps);
				//out.println(hand);
				//out.println(Wisc_found);

				Taxon t = new Taxon( taxcd, syncd, genus, family, species, common, status_code, photo, thumbmaps, hand, Wisc_found);
				//Comment the above custom Taxon construction with the next-line no-arg Taxon construct
				//Taxon t = new Taxon();
				alt.add(t);
			}
			out.println("<br>There are " + alt.size() + " records for this search<br>"); 
                        //out.println("<br>This specimen results page is shown in production at <a href=\"http://www.botany.wisc.edu/cgi-bin/SearchResults.cgi?SpCode=" + curTaxcd + "\">" + curTaxcd+ "</a><br><br>");
			for (int i = 0; i < alt.size(); i++) {
				Taxon t = (Taxon) alt.get(i);
				//String[] taxProps = new String[11];
				//String[] taxProps = t.getAll();
				//if (t.getsyncd() == ".") {
				//	out.println("<a href=\"/BotStuff/detailservlet?Taxcd=");
				//	out.println(t.gettaxcd());
				//	out.println("\">");
				//}
				if (t.isASN()) {
					out.println("<a href=\"/BotStuff/detailservlet?Taxcd=");
					out.println(t.gettaxcd());
					out.println("\">");
				}
				for(String prop: t.getAll()) {
					out.println(prop);
				}
				if (t.isASN()){
					out.println("</a>");
				}
				//if (t.getsyncd() == ".") {
				//	out.println("</a>");
				//}
				out.println("<hr>");
			}
			conn.close();
		}catch(Exception e) {
			out.println("oopsbot" + e.getMessage());
		}
		

		out.println("</body></html>");
	}
}
