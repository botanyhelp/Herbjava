package edu.wisc.botany.util;

///////////////////////////////////////////////////////////////////////////////
//Title:            Specimen.java
//Files:            Specimen.java
//
//Author:           Thomas Maher
//
//Credits:          
////////////////////////////80 columns wide //////////////////////////////////
//Specimen objects 

import java.io.*;
import edu.wisc.botany.util.*;


public class Specimen {
	private String ACCESSION;
	private String TYPE;
	private String COLLDATE;
	private String FLOWER;
	private String FRUIT;
	private String STERILE;
	private String OBJTYPE;
	private String INST;
	private String ANNCODE;
	private String ANNDATE;
	private String ANNSOURCE;
	private String CITY;
	private String CITYTYPE;
	private String COLL2NAME;
	private String COLL3NAME;
	private String COLL1NAME;
	private String COLLNO1;
	private String COLLEVENT;
	private String TAXCD;
	private String CFS;
	private String CFV;
	private String CFVariety;
	private String LONGX;
	private String LAT;
	private String ELEV;
	private String LLGENER;
	private String LONG2;
	private String LAT2;
	private String NOWLOC;
	private String LOAN;
	private String ORIGCD;
	private String PUBCD;
	private String LITCIT;
	private String PUBDATE;
	private String PUBDATEA;
	private String VERPERS;
	private String VERDATE;
	private String EX;
	private String ARTICLE;
	private String PREC;
	private String STATEL;
	private String COUNTY;
	private String COUNTRY;
	private String T1;
	private String R1;
	private String S1;
	private String NSEW_1;
	private String TRSGENER;
	private String T2;
	private String R2;
	private String S2;
	private String NSEW_2;
	private String PLACE;
	private String MAPFILE;
	private String username;


	public static void main(String argv[]) throws IOException {
		Specimen t = new Specimen();
		System.out.println(t.getACCESSION());
	}
	public Specimen() {
		this.ACCESSION = "ACCESSION";
		this.TYPE = "TYPE";
		this.COLLDATE = "COLLDATE";
		this.FLOWER = "FLOWER";
		this.FRUIT = "FRUIT";
		this.STERILE = "STERILE";
		this.OBJTYPE = "OBJTYPE";
		this.INST = "INST";
		this.ANNCODE = "ANNCODE";
		this.ANNDATE = "ANNDATE";
		this.ANNSOURCE = "ANNSOURCE";
		this.CITY = "CITY";
		this.CITYTYPE = "CITYTYPE";
		this.COLL2NAME = "COLL2NAME";
		this.COLL3NAME = "COLL3NAME";
		this.COLL1NAME = "COLL1NAME";
		this.COLLNO1 = "COLLNO1";
		this.COLLEVENT = "COLLEVENT";
		this.TAXCD = "TAXCD";
		this.CFS = "CFS";
		this.CFV = "CFV";
		this.CFVariety = "CFVariety";
		this.LONGX = "LONGX";
		this.LAT = "LAT";
		this.ELEV = "ELEV";
		this.LLGENER = "LLGENER";
		this.LONG2 = "LONG2";
		this.LAT2 = "LAT2";
		this.NOWLOC = "NOWLOC";
		this.LOAN = "LOAN";
		this.ORIGCD = "ORIGCD";
		this.PUBCD = "PUBCD";
		this.LITCIT = "LITCIT";
		this.PUBDATE = "PUBDATE";
		this.PUBDATEA = "PUBDATEA";
		this.VERPERS = "VERPERS";
		this.VERDATE = "VERDATE";
		this.EX = "EX";
		this.ARTICLE = "ARTICLE";
		this.PREC = "PREC";
		this.STATEL = "STATEL";
		this.COUNTY = "COUNTY";
		this.COUNTRY = "COUNTRY";
		this.T1 = "T1";
		this.R1 = "R1";
		this.S1 = "S1";
		this.NSEW_1 = "NSEW_1";
		this.TRSGENER = "TRSGENER";
		this.T2 = "T2";
		this.R2 = "R2";
		this.S2 = "S2";
		this.NSEW_2 = "NSEW_2";
		this.PLACE = "PLACE";
		this.MAPFILE = "MAPFILE";
		this.username = "username";
	}
	public Specimen(String ACCESSION, String TYPE, String COLLDATE, String FLOWER, String FRUIT, String STERILE, String OBJTYPE, String INST, String ANNCODE, String ANNDATE, String ANNSOURCE, String CITY, String CITYTYPE, String COLL2NAME, String COLL3NAME, String COLL1NAME, String COLLNO1, String COLLEVENT, String TAXCD, String CFS, String CFV, String CFVariety, String LONGX, String LAT, String ELEV, String LLGENER, String LONG2, String LAT2, String NOWLOC, String LOAN, String ORIGCD, String PUBCD, String LITCIT, String PUBDATE, String PUBDATEA, String VERPERS, String VERDATE, String EX, String ARTICLE, String PREC, String STATEL, String COUNTY, String COUNTRY, String T1, String R1, String S1, String NSEW_1, String TRSGENER, String T2, String R2, String S2, String NSEW_2, String PLACE, String MAPFILE, String username ) {
		this.ACCESSION = ACCESSION;
		this.TYPE = TYPE;
		this.COLLDATE = COLLDATE;
		this.FLOWER = FLOWER;
		this.FRUIT = FRUIT;
		this.STERILE = STERILE;
		this.OBJTYPE = OBJTYPE;
		this.INST = INST;
		this.ANNCODE = ANNCODE;
		this.ANNDATE = ANNDATE;
		this.ANNSOURCE = ANNSOURCE;
		this.CITY = CITY;
		this.CITYTYPE = CITYTYPE;
		this.COLL2NAME = COLL2NAME;
		this.COLL3NAME = COLL3NAME;
		this.COLL1NAME = COLL1NAME;
		this.COLLNO1 = COLLNO1;
		this.COLLEVENT = COLLEVENT;
		this.TAXCD = TAXCD;
		this.CFS = CFS;
		this.CFV = CFV;
		this.CFVariety = CFVariety;
		this.LONGX = LONGX;
		this.LAT = LAT;
		this.ELEV = ELEV;
		this.LLGENER = LLGENER;
		this.LONG2 = LONG2;
		this.LAT2 = LAT2;
		this.NOWLOC = NOWLOC;
		this.LOAN = LOAN;
		this.ORIGCD = ORIGCD;
		this.PUBCD = PUBCD;
		this.LITCIT = LITCIT;
		this.PUBDATE = PUBDATE;
		this.PUBDATEA = PUBDATEA;
		this.VERPERS = VERPERS;
		this.VERDATE = VERDATE;
		this.EX = EX;
		this.ARTICLE = ARTICLE;
		this.PREC = PREC;
		this.STATEL = STATEL;
		this.COUNTY = COUNTY;
		this.COUNTRY = COUNTRY;
		this.T1 = T1;
		this.R1 = R1;
		this.S1 = S1;
		this.NSEW_1 = NSEW_1;
		this.TRSGENER = TRSGENER;
		this.T2 = T2;
		this.R2 = R2;
		this.S2 = S2;
		this.NSEW_2 = NSEW_2;
		this.PLACE = PLACE;
		this.MAPFILE = MAPFILE;
		this.username = username;
	}
	

	public Boolean isType() {
		String ts = new String(".");
		if(TYPE.equals("1")) {
			return true;
		}else{
			return false;
		}
	}
	//getters
	public String getACCESSION() { return ACCESSION;}
	public String getTYPE() { return TYPE;}
	public String getCOLLDATE() { return COLLDATE;}
	public String getFLOWER() { return FLOWER;}
	public String getFRUIT() { return FRUIT;}
	public String getSTERILE() { return STERILE;}
	public String getOBJTYPE() { return OBJTYPE;}
	public String getINST() { return INST;}
	public String getANNCODE() { return ANNCODE;}
	public String getANNDATE() { return ANNDATE;}
	public String getANNSOURCE() { return ANNSOURCE;}
	public String getCITY() { return CITY;}
	public String getCITYTYPE() { return CITYTYPE;}
	public String getCOLL2NAME() { return COLL2NAME;}
	public String getCOLL3NAME() { return COLL3NAME;}
	public String getCOLL1NAME() { return COLL1NAME;}
	public String getCOLLNO1() { return COLLNO1;}
	public String getCOLLEVENT() { return COLLEVENT;}
	public String getTAXCD() { return TAXCD;}
	public String getCFS() { return CFS;}
	public String getCFV() { return CFV;}
	public String getCFVariety() { return CFVariety;}
	public String getLONGX() { return LONGX;}
	public String getLAT() { return LAT;}
	public String getELEV() { return ELEV;}
	public String getLLGENER() { return LLGENER;}
	public String getLONG2() { return LONG2;}
	public String getLAT2() { return LAT2;}
	public String getNOWLOC() { return NOWLOC;}
	public String getLOAN() { return LOAN;}
	public String getORIGCD() { return ORIGCD;}
	public String getPUBCD() { return PUBCD;}
	public String getLITCIT() { return LITCIT;}
	public String getPUBDATE() { return PUBDATE;}
	public String getPUBDATEA() { return PUBDATEA;}
	public String getVERPERS() { return VERPERS;}
	public String getVERDATE() { return VERDATE;}
	public String getEX() { return EX;}
	public String getARTICLE() { return ARTICLE;}
	public String getPREC() { return PREC;}
	public String getSTATEL() { return STATEL;}
	public String getCOUNTY() { return COUNTY;}
	public String getCOUNTRY() { return COUNTRY;}
	public String getT1() { return T1;}
	public String getR1() { return R1;}
	public String getS1() { return S1;}
	public String getNSEW_1() { return NSEW_1;}
	public String getTRSGENER() { return TRSGENER;}
	public String getT2() { return T2;}
	public String getR2() { return R2;}
	public String getS2() { return S2;}
	public String getNSEW_2() { return NSEW_2;}
	public String getPLACE() { return PLACE;}
	public String getMAPFILE() { return MAPFILE;}
	public String getusername() { return username;}

	public String[] getAll() {
		String[] specimenAll = new String[55];
		specimenAll[0] = getACCESSION();
		specimenAll[1] = getTYPE();
		specimenAll[2] = getCOLLDATE();
		specimenAll[3] = getFLOWER();
		specimenAll[4] = getFRUIT();
		specimenAll[5] = getSTERILE();
		specimenAll[6] = getOBJTYPE();
		specimenAll[7] = getINST();
		specimenAll[8] = getANNCODE();
		specimenAll[9] = getANNDATE();
		specimenAll[10] = getANNSOURCE();
		specimenAll[11] = getCITY();
		specimenAll[12] = getCITYTYPE();
		specimenAll[13] = getCOLL2NAME();
		specimenAll[14] = getCOLL3NAME();
		specimenAll[15] = getCOLL1NAME();
		specimenAll[16] = getCOLLNO1();
		specimenAll[17] = getCOLLEVENT();
		specimenAll[18] = getTAXCD();
		specimenAll[19] = getCFS();
		specimenAll[20] = getCFV();
		specimenAll[21] = getCFVariety();
		specimenAll[22] = getLONGX();
		specimenAll[23] = getLAT();
		specimenAll[24] = getELEV();
		specimenAll[25] = getLLGENER();
		specimenAll[26] = getLONG2();
		specimenAll[27] = getLAT2();
		specimenAll[28] = getNOWLOC();
		specimenAll[29] = getLOAN();
		specimenAll[30] = getORIGCD();
		specimenAll[31] = getPUBCD();
		specimenAll[32] = getLITCIT();
		specimenAll[33] = getPUBDATE();
		specimenAll[34] = getPUBDATEA();
		specimenAll[35] = getVERPERS();
		specimenAll[36] = getVERDATE();
		specimenAll[37] = getEX();
		specimenAll[38] = getARTICLE();
		specimenAll[39] = getPREC();
		specimenAll[40] = getSTATEL();
		specimenAll[41] = getCOUNTY();
		specimenAll[42] = getCOUNTRY();
		specimenAll[43] = getT1();
		specimenAll[44] = getR1();
		specimenAll[45] = getS1();
		specimenAll[46] = getNSEW_1();
		specimenAll[47] = getTRSGENER();
		specimenAll[48] = getT2();
		specimenAll[49] = getR2();
		specimenAll[50] = getS2();
		specimenAll[51] = getNSEW_2();
		specimenAll[52] = getPLACE();
		specimenAll[53] = getMAPFILE();
		specimenAll[54] = getusername();
		return specimenAll;
	}
		

	//setters
	void setACCESSION(String ACCESSION) {this.ACCESSION = ACCESSION;}
	void setTYPE(String TYPE) {this.TYPE = TYPE;}
	void setCOLLDATE(String COLLDATE) {this.COLLDATE = COLLDATE;}
	void setFLOWER(String FLOWER) {this.FLOWER = FLOWER;}
	void setFRUIT(String FRUIT) {this.FRUIT = FRUIT;}
	void setSTERILE(String STERILE) {this.STERILE = STERILE;}
	void setOBJTYPE(String OBJTYPE) {this.OBJTYPE = OBJTYPE;}
	void setINST(String INST) {this.INST = INST;}
	void setANNCODE(String ANNCODE) {this.ANNCODE = ANNCODE;}
	void setANNDATE(String ANNDATE) {this.ANNDATE = ANNDATE;}
	void setANNSOURCE(String ANNSOURCE) {this.ANNSOURCE = ANNSOURCE;}
	void setCITY(String CITY) {this.CITY = CITY;}
	void setCITYTYPE(String CITYTYPE) {this.CITYTYPE = CITYTYPE;}
	void setCOLL2NAME(String COLL2NAME) {this.COLL2NAME = COLL2NAME;}
	void setCOLL3NAME(String COLL3NAME) {this.COLL3NAME = COLL3NAME;}
	void setCOLL1NAME(String COLL1NAME) {this.COLL1NAME = COLL1NAME;}
	void setCOLLNO1(String COLLNO1) {this.COLLNO1 = COLLNO1;}
	void setCOLLEVENT(String COLLEVENT) {this.COLLEVENT = COLLEVENT;}
	void setTAXCD(String TAXCD) {this.TAXCD = TAXCD;}
	void setCFS(String CFS) {this.CFS = CFS;}
	void setCFV(String CFV) {this.CFV = CFV;}
	void setCFVariety(String CFVariety) {this.CFVariety = CFVariety;}
	void setLONGX(String LONGX) {this.LONGX = LONGX;}
	void setLAT(String LAT) {this.LAT = LAT;}
	void setELEV(String ELEV) {this.ELEV = ELEV;}
	void setLLGENER(String LLGENER) {this.LLGENER = LLGENER;}
	void setLONG2(String LONG2) {this.LONG2 = LONG2;}
	void setLAT2(String LAT2) {this.LAT2 = LAT2;}
	void setNOWLOC(String NOWLOC) {this.NOWLOC = NOWLOC;}
	void setLOAN(String LOAN) {this.LOAN = LOAN;}
	void setORIGCD(String ORIGCD) {this.ORIGCD = ORIGCD;}
	void setPUBCD(String PUBCD) {this.PUBCD = PUBCD;}
	void setLITCIT(String LITCIT) {this.LITCIT = LITCIT;}
	void setPUBDATE(String PUBDATE) {this.PUBDATE = PUBDATE;}
	void setPUBDATEA(String PUBDATEA) {this.PUBDATEA = PUBDATEA;}
	void setVERPERS(String VERPERS) {this.VERPERS = VERPERS;}
	void setVERDATE(String VERDATE) {this.VERDATE = VERDATE;}
	void setEX(String EX) {this.EX = EX;}
	void setARTICLE(String ARTICLE) {this.ARTICLE = ARTICLE;}
	void setPREC(String PREC) {this.PREC = PREC;}
	void setSTATEL(String STATEL) {this.STATEL = STATEL;}
	void setCOUNTY(String COUNTY) {this.COUNTY = COUNTY;}
	void setCOUNTRY(String COUNTRY) {this.COUNTRY = COUNTRY;}
	void setT1(String T1) {this.T1 = T1;}
	void setR1(String R1) {this.R1 = R1;}
	void setS1(String S1) {this.S1 = S1;}
	void setNSEW_1(String NSEW_1) {this.NSEW_1 = NSEW_1;}
	void setTRSGENER(String TRSGENER) {this.TRSGENER = TRSGENER;}
	void setT2(String T2) {this.T2 = T2;}
	void setR2(String R2) {this.R2 = R2;}
	void setS2(String S2) {this.S2 = S2;}
	void setNSEW_2(String NSEW_2) {this.NSEW_2 = NSEW_2;}
	void setPLACE(String PLACE) {this.PLACE = PLACE;}
	void setMAPFILE(String MAPFILE) {this.MAPFILE = MAPFILE;}
	void setusername(String username) {this.username = username;}

}

