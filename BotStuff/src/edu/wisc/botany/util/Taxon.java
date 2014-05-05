package edu.wisc.botany.util;

///////////////////////////////////////////////////////////////////////////////
//Title:            Taxon.java
//Files:            Taxon.java
//
//Author:           Thomas Maher
//
//Credits:          
////////////////////////////80 columns wide //////////////////////////////////
//Taxon objects are made to run misc. system commands.

import java.io.*;
import edu.wisc.botany.util.*;


public class Taxon {
	private String taxcd;
	private String syncd;
	private String genus;
	private String family;
	private String species;
	private String common;
	private String status_code;
	private String photo;
	private String thumbmaps;
	private String hand;
	private String Wisc_found;

	public static void main(String argv[]) throws IOException {
		Taxon t = new Taxon();
		System.out.println(t.gettaxcd());
	}
	public Taxon() {
		taxcd =  "ABIBAL";
		syncd =  ".";
		genus =  "Abies";
		family =  "Pinaceae";
		species =  "balsamea";
		common =  "balsam fir, Canada balsam";
		status_code =  "n";
		photo =  "../photos/ABIBAL_KKOHOUT.jpg";
		thumbmaps =  "../thumbmbap/ABIBAL.gif";
		hand =  "";
		Wisc_found =  "W";
	}
	public Taxon(String taxcd, String syncd, String genus, String family, String species, String common, String status_code, String photo, String thumbmaps, String hand, String Wisc_found) {
		this.taxcd =  taxcd;
		this.syncd =  syncd;
		this.genus =  genus;
		this.family =  family;
		this.species =  species;
		this.common =  common;
		this.status_code =  status_code;
		this.photo =  photo;
		this.thumbmaps =  thumbmaps;
		this.hand =  hand;
		this.Wisc_found =  Wisc_found;
	}

	public Boolean isASN() {
		String ts = new String(".");
		if(syncd.equals(ts)) {
			return true;
		}else{
			return false;
		}
	}
	//getters
	public String gettaxcd() { return taxcd;}
	public String getsyncd() { return syncd;}
	public String getgenus() { return genus;}
	public String getfamily() { return family;}
	public String getspecies() { return species;}
	public String getcommon() { return common;}
	public String getstatus_code() { return status_code;}
	public String getphoto() { return photo;}
	public String getthumbmaps() { return thumbmaps;}
	public String gethand() { return hand;}
	public String getWisc_found() { return Wisc_found;}
	public String[] getAll() {
		String[] taxAll = new String[11];
		taxAll[0] = gettaxcd();
		taxAll[1] = getsyncd();
		taxAll[2] = getgenus();
		taxAll[3] = getfamily();
		taxAll[4] = getspecies();
		taxAll[5] = getcommon();
		taxAll[6] = getstatus_code();
		taxAll[7] = getphoto();
		taxAll[8] = getthumbmaps();
		taxAll[9] = gethand();
		taxAll[10] = getWisc_found();
		return taxAll;
	}
		

	//setters
	void settaxcd(String taxcd) {this.taxcd = taxcd;}
	void setsyncd(String syncd) {this.syncd = syncd;}
	void setgenus(String genus) {this.genus = genus;}
	void setfamily(String family) {this.family = family;}
	void setspecies(String species) {this.species = species;}
	void setcommon(String common) {this.common = common;}
	void setstatus_code(String status_code) {this.status_code = status_code;}
	void setphoto(String photo) {this.photo = photo;}
	void setthumbmaps(String thumbmaps) {this.thumbmaps = thumbmaps;}
	void sethand(String hand) {this.hand = hand;}
	void setWisc_found(String Wisc_found) {this.Wisc_found = Wisc_found;}

}



