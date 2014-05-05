package edu.wisc.botany.web;
///////////////////////////////////////////////////////////////////////////////
//Title:            DetailServlet.java
//Files:            DetailServlet.java
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

 
public class DetailServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>\n" );
		out.println("<head><title>Vascular Plants Detail Names</title></head>\n" );
		out.println("<body>\n" );
		out.println("<h1>Vascular Plants Detail Names</h1>\n" );

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
			String q = "SELECT Taxcd, Syncd, genus, species, authority, subsp, variety, forma, subsp_auth, var_auth, forma_auth, sub_family, tribe, common, Wisc_found, ssp, var, f, hybrids, status_code, hide, USDA, WETINDICAT, FAM_NAME, FAMILY, FAMILY_COMMON, SYNWisc_found, SYNS_STATUS, SYNV_STATUS, SYNF_STATUS, SYNHYBRIDS_STATUS, speciesweb_Taxcd, Status, Photo, Photographer, Thumbmaps, Accgenus, Hand, growth_habit_bck, blooming_dt_bck, origin_bck, Thumbphoto, growth_habit, blooming_dt, origin, Taxa  FROM spdetail WHERE taxcd LIKE '";
			q += taxcdParam;
			q += "%'";
			rs = stmt.executeQuery(q);
			ArrayList<Species> alt = new ArrayList<Species>();
			while(rs.next()) { 
				//taxcd is  a String
				//Comment the above custom Species construction with the next-line no-arg Species construct
				String Taxcd = rs.getString(1);
				String Syncd = rs.getString(2);
				String genus = rs.getString(3);
				String species = rs.getString(4);
				String authority = rs.getString(5);
				String subsp = rs.getString(6);
				String variety = rs.getString(7);
				String forma = rs.getString(8);
				String subsp_auth = rs.getString(9);
				String var_auth = rs.getString(10);
				String forma_auth = rs.getString(11);
				String sub_family = rs.getString(12);
				String tribe = rs.getString(13);
				String common = rs.getString(14);
				String Wisc_found = rs.getString(15);
				String ssp = rs.getString(16);
				String var = rs.getString(17);
				String f = rs.getString(18);
				String hybrids = rs.getString(19);
				String status_code = rs.getString(20);
				String hide = rs.getString(21);
				String USDA = rs.getString(22);
				String WETINDICAT = rs.getString(23);
				String FAM_NAME = rs.getString(24);
				String FAMILY = rs.getString(25);
				String FAMILY_COMMON = rs.getString(26);
				String SYNWisc_found = rs.getString(27);
				String SYNS_STATUS = rs.getString(28);
				String SYNV_STATUS = rs.getString(29);
				String SYNF_STATUS = rs.getString(30);
				String SYNHYBRIDS_STATUS = rs.getString(31);
				String speciesweb_Taxcd = rs.getString(32);
				String Status = rs.getString(33);
				String Photo = rs.getString(34);
				String Photographer = rs.getString(35);
				String Thumbmaps = rs.getString(36);
				String Accgenus = rs.getString(37);
				String Hand = rs.getString(38);
				String growth_habit_bck = rs.getString(39);
				String blooming_dt_bck = rs.getString(40);
				String origin_bck = rs.getString(41);
				String Thumbphoto = rs.getString(42);
				String growth_habit = rs.getString(43);
				String blooming_dt = rs.getString(44);
				String origin = rs.getString(45);
				String Taxa = rs.getString(46);
				Species t = new Species(Taxcd, Syncd, genus, species, authority, subsp, variety, forma, subsp_auth, var_auth, forma_auth, sub_family, tribe, common, Wisc_found, ssp, var, f, hybrids, status_code, hide, USDA, WETINDICAT, FAM_NAME, FAMILY, FAMILY_COMMON, SYNWisc_found, SYNS_STATUS, SYNV_STATUS, SYNF_STATUS, SYNHYBRIDS_STATUS, speciesweb_Taxcd, Status, Photo, Photographer, Thumbmaps, Accgenus, Hand, growth_habit_bck, blooming_dt_bck, origin_bck, Thumbphoto, growth_habit, blooming_dt, origin, Taxa);
				//Species t = new Species();
				alt.add(t);
			}
			out.println("<br>The taxon " + taxcdParam + " returned " + alt.size() + " results.");
			out.println("<br>Accepted Species Names are linked, Synonyms are not.");
			out.println("<br>The species detail data is shown in production at <a href=\"http://www.botany.wisc.edu/cgi-bin/detail.cgi?SpCode=" + taxcdParam + "\">" + taxcdParam+ "</a><br><br>");
			for (int i = 0; i < alt.size(); i++) {
				Species t = (Species) alt.get(i);
				if (t.isASN()) {
					out.println("<a href=\"/BotStuff/searchspecimenservlet?Taxcd=");
					out.println(t.getTaxcd());
					out.println("\">");
				}
				for(String prop: t.getAll()) {
					out.println(prop);
					if (prop.length() > 0) {
						out.println("<br>");
					}
				}
				if (t.isASN()){
					out.println("</a>");
				}
				out.println("<hr>");
			}
			conn.close();
		}catch(Exception e) {
			out.println("oopsbot" + e.getMessage());
		}//end catch
		

		out.println("</body></html>");
	}//end doGet
}//end class
