Wisconsin Herbarium on Java in Tomcat README

This file discusses how to deploy Wisconsin Herbarium 
Java application.  See the Java source code.  This 
code works with the same MySQL database that the 
production Perl application works with. Note that 
the Java version has an extremely minimal "view" with 
bare and basic HTML.  The routine to generate the ASN 
(accepted species name) does (I think) work properly.

##############################################################################
installing UW Herbarium onto tomcat
##############################################################################
1. Install ubuntu, and run sudo apt-get update a few times.
2. Install java and tomcat as describe below.
3. Install all of the source code files under tomcat's directory
/usr/share/tomcat5.5/webapps
4.  Get into webapps/code/BotStuff and compile all code like this: 
  
javac -d classes src/edu/wisc/botany/util/Species.java
javac -d classes src/edu/wisc/botany/util/Specimen.java
javac -d classes src/edu/wisc/botany/util/Taxon.java

javac -d classes src/edu/wisc/botany/web/BotServlet.java
javac -d classes src/edu/wisc/botany/web/CommonServlet.java
javac -d classes src/edu/wisc/botany/web/GenusServlet.java
javac -d classes src/edu/wisc/botany/web/SearchSpecimenServlet.java
javac -d classes src/edu/wisc/botany/web/DetailServlet.java  
javac -d classes src/edu/wisc/botany/web/SearchResultsServlet.java
javac -d classes src/edu/wisc/botany/web/SpecimenServlet.java
javac -d classes src/edu/wisc/botany/web/FamilyServlet.java  

javac -d classes src/edu/wisc/botany/model/JdbcConnTest.java
javac -d classes src/edu/wisc/botany/model/JdbcConn.java
javac -d classes src/edu/wisc/botany/model/JdbcTest.java

5. make dir /usr/share/tomcat5.5/webapps/BotStuff/WEB-INF/
6. Get into webapps/code/BotStuff and copy all the classes like this: 

tar -cf - ./classes/|(cd ../../BotStuff/WEB-INF/; tar -xf -)

7. Install the DD lines below (in the next entry) into this file:

/usr/share/tomcat5.5/webapps/code/BotStuff/WEB-INF/web.xml

8. restart tomcat like this:

/etc/init.d/tomcat5.5 restart

9. Visit this location to test operation:

http://127.0.0.1:8180/BotStuff/
http://127.0.0.1/BotStuff/

##############################################################################
 web.xml data
##############################################################################
root@www:/# cat /usr/share/tomcat5.5/webapps/BotStuff/WEB-INF/web.xml

<web-app xmlns="http://java.sun.com/xml/ns/j2ee" version="2.4"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http:/java.sun.com/dtd/web-app_2_3.dtd">

  <servlet>
    <servlet-name>botservlet</servlet-name>
    <servlet-class>edu.wisc.botany.web.BotServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>botservlet</servlet-name>
    <url-pattern>/botservlet</url-pattern>
  </servlet-mapping>

  <servlet>
    <servlet-name>varlogmessagesservlet</servlet-name>
    <servlet-class>edu.wisc.botany.web.VarLogMessagesServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>varlogmessagesservlet</servlet-name>
    <url-pattern>/varlogmessagesservlet</url-pattern>
  </servlet-mapping>

  <servlet>
    <servlet-name>varlogapache2accessservlet</servlet-name>
    <servlet-class>edu.wisc.botany.web.VarLogApache2AccessServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>varlogapache2accessservlet</servlet-name>
    <url-pattern>/varlogapache2accessservlet</url-pattern>
  </servlet-mapping>

  <servlet>
    <servlet-name>varlogapache2errorservlet</servlet-name>
    <servlet-class>edu.wisc.botany.web.VarLogApache2ErrorServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>varlogapache2errorservlet</servlet-name>
    <url-pattern>/varlogapache2errorservlet</url-pattern>
  </servlet-mapping>

  <servlet>
    <servlet-name>varlogmysqlmysqlservlet</servlet-name>
    <servlet-class>edu.wisc.botany.web.VarLogMysqlMysqlServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>varlogmysqlmysqlservlet</servlet-name>
    <url-pattern>/varlogmysqlmysqlservlet</url-pattern>
  </servlet-mapping>

  <servlet>
    <servlet-name>pdfservlet</servlet-name>
    <servlet-class>edu.wisc.botany.web.PdfServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>pdfservlet</servlet-name>
    <url-pattern>/pdfservlet</url-pattern>
  </servlet-mapping>

  <servlet>
    <servlet-name>commonservlet</servlet-name>
    <servlet-class>edu.wisc.botany.web.CommonServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>commonservlet</servlet-name>
    <url-pattern>/commonservlet</url-pattern>
  </servlet-mapping>

  <servlet>
    <servlet-name>spdetailservlettwo</servlet-name>
    <servlet-class>edu.wisc.botany.web.SpdetailServletTwo</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>spdetailservlettwo</servlet-name>
    <url-pattern>/spdetailservlettwo</url-pattern>
  </servlet-mapping>

  <servlet>
    <servlet-name>searchresultsservlet</servlet-name>
    <servlet-class>edu.wisc.botany.web.SearchResultsServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>searchresultsservlet</servlet-name>
    <url-pattern>/searchresultsservlet</url-pattern>
  </servlet-mapping>

  <servlet>
    <servlet-name>familyservlet</servlet-name>
    <servlet-class>edu.wisc.botany.web.FamilyServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>familyservlet</servlet-name>
    <url-pattern>/familyservlet</url-pattern>
  </servlet-mapping>

  <servlet>
    <servlet-name>genusservlet</servlet-name>
    <servlet-class>edu.wisc.botany.web.GenusServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>genusservlet</servlet-name>
    <url-pattern>/genusservlet</url-pattern>
  </servlet-mapping>

  <servlet>
    <servlet-name>detailservlet</servlet-name>
    <servlet-class>edu.wisc.botany.web.DetailServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>detailservlet</servlet-name>
    <url-pattern>/detailservlet</url-pattern>
  </servlet-mapping>

  <servlet>
    <servlet-name>searchspecimenservlet</servlet-name>
    <servlet-class>edu.wisc.botany.web.SearchSpecimenServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>searchspecimenservlet</servlet-name>
    <url-pattern>/searchspecimenservlet</url-pattern>
  </servlet-mapping>

  <servlet>
    <servlet-name>specimenservlet</servlet-name>
    <servlet-class>edu.wisc.botany.web.SpecimenServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>specimenservlet</servlet-name>
    <url-pattern>/specimenservlet</url-pattern>
  </servlet-mapping>

</web-app>

##############################################################################
install java on ubuntu
##############################################################################


root@www:~# which java
root@www:~# apt-get install sun-java6-bin sun-java6-jre sun-java6-jdk
Reading package lists... Done
Building dependency tree       
Reading state information... Done
The following extra packages will be installed:
  java-common odbcinst1debian1 unixodbc
Suggested packages:
  equivs binfmt-support openjdk-6-doc sun-java6-demo sun-java6-source sun-java6-fonts
  sun-java6-plugin ia32-sun-java6-plugin ttf-baekmuk ttf-unfonts ttf-unfonts-core
  ttf-kochi-gothic ttf-sazanami-gothic ttf-kochi-mincho ttf-sazanami-mincho
  ttf-wqy-zenhei libct1 libmyodbc odbc-postgresql
Recommended packages:
  libasound2 libnss-mdns libxtst6 gsfonts-x11
The following NEW packages will be installed:
  java-common odbcinst1debian1 sun-java6-bin sun-java6-jdk sun-java6-jre unixodbc
0 upgraded, 6 newly installed, 0 to remove and 43 not upgraded.
Need to get 54.5MB of archives.
After this operation, 161MB of additional disk space will be used.


##############################################################################
 install tomcat-webapps
##############################################################################


root@www:~# apt-get install tomcat5.5-webapps
Reading package lists... Done
Building dependency tree       
Reading state information... Done
The following extra packages will be installed:
  ant jsvc libbcel-java libcommons-beanutils-java libcommons-collections-java
  libcommons-collections3-java libcommons-daemon-java libcommons-dbcp-java
  libcommons-digester-java libcommons-el-java libcommons-launcher-java
  libcommons-logging-java libcommons-modeler-java libcommons-pool-java libecj-java
  libjaxp1.3-java liblog4j1.2-java libmx4j-java libregexp-java libservlet2.3-java
  libservlet2.4-java libtomcat5.5-java libxerces2-java tomcat5.5
Suggested packages:
  ant-doc libbcel-java-doc libcommons-beanutils-java-doc
  libcommons-collections3-java-doc liblogkit-java libavalon-framework-java
  classpath-doc ecj libgnumail-java jython libservlet2.4-java-gcj libxerces2-java-doc
  libapache2-mod-jk tomcat5.5-admin
Recommended packages:
  ant-optional ant-gcj libecj-java-gcj libjaxp1.3-java-gcj liblog4j1.2-java-gcj
  libxerces2-java-gcj
The following NEW packages will be installed:
  ant jsvc libbcel-java libcommons-beanutils-java libcommons-collections-java
  libcommons-collections3-java libcommons-daemon-java libcommons-dbcp-java
  libcommons-digester-java libcommons-el-java libcommons-launcher-java
  libcommons-logging-java libcommons-modeler-java libcommons-pool-java libecj-java
  libjaxp1.3-java liblog4j1.2-java libmx4j-java libregexp-java libservlet2.3-java
  libservlet2.4-java libtomcat5.5-java libxerces2-java tomcat5.5 tomcat5.5-webapps


##############################################################################
 tomcat-webapps installed tomcat5.5
##############################################################################
root@www:~#  apt-get install tomcat5.5
Reading package lists... Done
Building dependency tree       
Reading state information... Done
tomcat5.5 is already the newest version.
tomcat5.5 set to manually installed.
0 upgraded, 0 newly installed, 0 to remove and 43 not upgraded.
##############################################################################
 checkout where it listens:
##############################################################################
root@www:~# netstat -tan
Active Internet connections (servers and established)
Proto Recv-Q Send-Q Local Address           Foreign Address         State      
tcp        0      0 0.0.0.0:993             0.0.0.0:*               LISTEN     
tcp        0      0 0.0.0.0:995             0.0.0.0:*               LISTEN     
tcp        0      0 127.0.0.1:3306          0.0.0.0:*               LISTEN     
tcp        0      0 0.0.0.0:139             0.0.0.0:*               LISTEN     
tcp        0      0 0.0.0.0:110             0.0.0.0:*               LISTEN     
tcp        0      0 0.0.0.0:143             0.0.0.0:*               LISTEN     
tcp        0      0 0.0.0.0:80              0.0.0.0:*               LISTEN     
tcp        0      0 127.0.0.1:53        0.0.0.0:*               LISTEN     
tcp        0      0 127.0.0.1:53            0.0.0.0:*               LISTEN     
tcp        0      0 0.0.0.0:25              0.0.0.0:*               LISTEN     
tcp        0      0 127.0.0.1:953           0.0.0.0:*               LISTEN     
tcp        0      0 0.0.0.0:445             0.0.0.0:*               LISTEN     
tcp6       0      0 :::8009                 :::*                    LISTEN     
tcp6       0      0 :::8180                 :::*                    LISTEN     
tcp6       0      0 :::22                   :::*                    LISTEN     
tcp6       0      0 ::1:953                 :::*                    LISTEN     
##############################################################################
 exercise tomcat start and stop:
##############################################################################
root@www:~# /etc/init.d/tomcat5.5 start
 * Starting Tomcat servlet engine tomcat5.5
   ...done.
root@www:~# /etc/init.d/tomcat5.5 stop
 * Stopping Tomcat servlet engine tomcat5.5
   ...done.
root@www:~# /etc/init.d/tomcat5.5 restart
 * Starting Tomcat servlet engine tomcat5.5
   ...done.
root@www:~# cd /usr/share/tomcat5.5



##############################################################################
 see the big mess of links in tomcat5.5. from ubuntu
##############################################################################
root@www:~# cd /usr/share/tomcat5.5
root@www:/usr/share/tomcat5.5# ls -lh
total 12K
drwxr-xr-x 2 root root 4.0K 2010-05-01 10:03 bin
drwxr-xr-x 6 root root 4.0K 2010-05-01 10:03 common
lrwxrwxrwx 1 root root   14 2010-05-01 10:03 conf -> /etc/tomcat5.5
lrwxrwxrwx 1 root root   16 2010-05-01 10:03 doc -> ../doc/tomcat5.5
lrwxrwxrwx 1 root root   23 2010-05-01 10:03 logs -> /var/lib/tomcat5.5/logs
drwxr-xr-x 4 root root 4.0K 2010-05-01 10:03 server
lrwxrwxrwx 1 root root   25 2010-05-01 10:03 shared -> /var/lib/tomcat5.5/shared
lrwxrwxrwx 1 root root   23 2010-05-01 10:03 temp -> /var/lib/tomcat5.5/temp
lrwxrwxrwx 1 root root   26 2010-05-01 10:03 webapps -> /var/lib/tomcat5.5/webapps
lrwxrwxrwx 1 root root   23 2010-05-01 10:03 work -> /var/lib/tomcat5.5/work
root@www:/usr/share/tomcat5.5# 



##############################################################################
 setup tomcat build and develop path...all code and class files under webapps
##############################################################################
root@www:/var/lib/tomcat5.5# cd webapps/
root@www:/var/lib/tomcat5.5/webapps# ls
root@www:/var/lib/tomcat5.5/webapps# mkdir BotStuff
root@www:/var/lib/tomcat5.5/webapps# cd !$
cd BotStuff
root@www:/var/lib/tomcat5.5/webapps/BotStuff# mkdir WEB-INF
root@www:/var/lib/tomcat5.5/webapps/BotStuff# cd !$
cd WEB-INF
root@www:/var/lib/tomcat5.5/webapps/BotStuff/WEB-INF# mkdir classes
root@www:/var/lib/tomcat5.5/webapps/BotStuff/WEB-INF# mkdir lib
root@www:/var/lib/tomcat5.5/webapps/BotStuff/WEB-INF# mkdir classes/edu/
root@www:/var/lib/tomcat5.5/webapps/BotStuff/WEB-INF# mkdir classes/edu/wisc/
root@www:/var/lib/tomcat5.5/webapps/BotStuff/WEB-INF# mkdir classes/edu/wisc/botany/
root@www:/var/lib/tomcat5.5/webapps/BotStuff/WEB-INF# mkdir classes/edu/wisc/botany/web/
root@www:/var/lib/tomcat5.5/webapps/BotStuff/WEB-INF# mkdir classes/edu/wisc/botany/model/
root@www:/var/lib/tomcat5.5/webapps/BotStuff/WEB-INF# mkdir classes/edu/wisc/botany/util/
root@www:/var/lib/tomcat5.5/webapps/BotStuff/WEB-INF# cd ../
root@www:/var/lib/tomcat5.5/webapps/BotStuff# cd ./
root@www:/var/lib/tomcat5.5/webapps/BotStuff# cd ..
root@www:/var/lib/tomcat5.5/webapps# ls
BotStuff
root@www:/var/lib/tomcat5.5/webapps# mkdir code
root@www:/var/lib/tomcat5.5/webapps# cd code/
root@www:/var/lib/tomcat5.5/webapps/code# ls
root@www:/var/lib/tomcat5.5/webapps/code# mkdir edu
root@www:/var/lib/tomcat5.5/webapps/code# rmdir edu/
root@www:/var/lib/tomcat5.5/webapps/code# mkdir BotStuff
root@www:/var/lib/tomcat5.5/webapps/code# cd !$
cd BotStuff
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# mkdir etc
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# mkdir lib
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# mkdir src
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# mkdir classes
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# mkdir web
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# cd src/
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff/src# ls
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff/src# mkdir edu
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff/src# mkdir edu/wisc
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff/src# mkdir edu/wisc/botany
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff/src# 

##############################################################################
 setup classpath at login time, notice the last two lines of /root/.bashrc
##############################################################################
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff/src# echo $JAVA_HOME

root@www:/var/lib/tomcat5.5/webapps/code/BotStuff/src# source /root/.bashrc
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff/src# echo $JAVA_HOME
/usr/lib/jvm/java-6-sun
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff/src# java -version
java version "1.6.0_17"
Java(TM) SE Runtime Environment (build 1.6.0_17-b04)
Java HotSpot(TM) Server VM (build 14.3-b01, mixed mode)
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff/src# tail -3 /root/.bashrc
#fi
export JAVA_HOME=/usr/lib/jvm/java-6-sun
export PATH=$PATH:$JAVA_HOME/bin
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff/src# 
##############################################################################
 set classpath for ubuntu8.04 on compile command line:
##############################################################################
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# export CLASSPATH=/usr/share/java/*:/usr/share/tomcat5.5/common/lib/*:.:/usr/share/tomcat5.5/webapps/code/BotStuff/classes/

root@www:/usr/share/tomcat5.5/webapps/BotStuff# echo $CLASSPATH
/usr/share/java/*:/usr/share/tomcat5.5/common/lib/*:.:/usr/share/tomcat5.5/webapps/code/BotStuff/classes/
##############################################################################
 test db connection using JdbcTest.java we just compiled:
##############################################################################
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# cat src/edu/wisc/botany/JdbcTest.java 
package edu.wisc.botany.model;
import java.sql.*;

public class JdbcTest {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/herbfifty", "www-data", "apachePASS");

			Statement stmt = conn.createStatement();
			ResultSet rs;
			rs = stmt.executeQuery("Select Taxcd, COFC from spdetail LIMIT 3");
			while(rs.next()) { 
				System.out.println(rs.getString(1));
				System.out.println(rs.getInt(2));
			}
			conn.close();
		}catch(Exception e) {
			System.out.println("oops" + e.getMessage());
		}
	}
}
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# 
##############################################################################
 install the jdbc driver for mysql
##############################################################################
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# apt-cache search mysql | grep java
libmysql-java - Java database (JDBC) driver for MySQL
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# apt-get install libmysql-java
Reading package lists... Done
Building dependency tree       
Reading state information... Done
The following NEW packages will be installed:
  libmysql-java
0 upgraded, 1 newly installed, 0 to remove and 43 not upgraded.
Need to get 691kB of archives.
After this operation, 766kB of additional disk space will be used.
Get:1 http://us.archive.ubuntu.com hardy/main libmysql-java 5.1.5+dfsg-2 [691kB]
Fetched 691kB in 2s (339kB/s)         
Selecting previously deselected package libmysql-java.
(Reading database ... 24790 files and directories currently installed.)
Unpacking libmysql-java (from .../libmysql-java_5.1.5+dfsg-2_all.deb) ...
Setting up libmysql-java (5.1.5+dfsg-2) ...
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# 
##############################################################################
 test servlet container by deploying a test app botservlet
##############################################################################
root@www:/usr/share/tomcat5.5/webapps/code/BotStuff# cat src/edu/wisc/botany/web/BotServlet.java 
package edu.wisc.botany.web;
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class BotServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " );
    out.println("Transitional//EN\">\n" );
    out.println("<html>\n" );
    out.println("<head><title>botservlet</title></head>\n" );
    out.println("<body>\n" );
    out.println("<h1>botservlet works!</h1>\n" );
    out.println("</body></html>");
  }
}
root@www:/usr/share/tomcat5.5/webapps/code/BotStuff# 
##############################################################################
 compile test botservlet:
##############################################################################
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# !javac
javac -classpath /usr/share/java/*:/usr/share/tomcat5.5/common/lib/*:. -d classes src/edu/wisc/botany/web/BotServlet.java 
##############################################################################
 copy class file just compiled  to deployment area of tomcat:
##############################################################################
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# cp classes/edu/wisc/botany/web/BotServlet.class ../../BotStuff/WEB-INF/classes/edu/wisc/botany/web/
##############################################################################
 notice carefully the location and contents of the DD web.xml:
##############################################################################
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# javac -classpath /usr/share/java/*:/usr/share/tomcat5.5/common/lib/*:. -d classes src/edu/wisc/botany/web/BotServlet.java 
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# 
root@www:/usr/share/tomcat5.5/webapps/code/BotStuff# cat ../../BotStuff/WEB-INF/web.xml 
<web-app xmlns="http://java.sun.com/xml/ns/j2ee" version="2.4"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http:/java.sun.com/dtd/web-app_2_3.dtd">
  <servlet>
    <servlet-name>botservlet</servlet-name>
    <servlet-class>edu.wisc.botany.web.BotServlet</servlet-class>
  </servlet>

  <servlet-mapping>
    <servlet-name>botservlet</servlet-name>
    <url-pattern>/botservlet</url-pattern>
  </servlet-mapping>
</web-app>
root@www:/usr/share/tomcat5.5/webapps/code/BotStuff# 
##############################################################################
 restart tomcat, because a deployment descriptor has changed:
##############################################################################
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# /etc/init.d/tomcat5.5 restart
 * Stopping Tomcat servlet engine tomcat5.5
   ...done.
 * Starting Tomcat servlet engine tomcat5.5
   ...done.
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# 
##############################################################################
 after restarting tomcat, to re-read the web.xml, we can get the page:
##############################################################################
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# !wget
wget http://127.0.0.1:8180/BotStuff/botservlet
--12:32:55--  http://127.0.0.1:8180/BotStuff/botservlet
           => `botservlet'
Connecting to 127.0.0.1:8180... connected.
HTTP request sent, awaiting response... 200 OK
Length: 171

100%[==========================================================================================>] 171           --.--K/s             

12:32:55 (6.61 MB/s) - `botservlet' saved [171/171]
##############################################################################
 now that we have a working tomcat, lets test our mysql driver
##############################################################################
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# vi src/edu/wisc/botany/model/JdbcTest.java 
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# !javac
javac -classpath /usr/share/java/*:/usr/share/tomcat5.5/common/lib/*:. -d classes src/edu/wisc/botany/model/JdbcTest.java 
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff# cd classes 
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff/classes# java edu/wisc/botany/
BotServlet.class  JdbcTest.class    model/            web/              
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff/classes# java edu/wisc/botany/model/JdbcTest
ABAJUP
0
ABIBAL
5
ABIBAL
0
root@www:/var/lib/tomcat5.5/webapps/code/BotStuff/classes# 
