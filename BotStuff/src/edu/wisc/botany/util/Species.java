package edu.wisc.botany.util;

///////////////////////////////////////////////////////////////////////////////
//Title:            Species.java
//Files:            Species.java
//
//Author:           Thomas Maher
//
//Credits:          
////////////////////////////80 columns wide //////////////////////////////////
//Species objects are made to run misc. system commands.

import java.io.*;
import edu.wisc.botany.util.*;


public class Species {
	private String Taxcd;
	private String Syncd;
	private String genus;
	private String species;
	private String authority;
	private String subsp;
	private String variety;
	private String forma;
	private String subsp_auth;
	private String var_auth;
	private String forma_auth;
	private String sub_family;
	private String tribe;
	private String common;
	private String Wisc_found;
	private String ssp;
	private String var;
	private String f;
	private String hybrids;
	private String status_code;
	private String hide;
	private String USDA;
	private String WETINDICAT;
	private String FAM_NAME;
	private String FAMILY;
	private String FAMILY_COMMON;
	private String SYNWisc_found;
	private String SYNS_STATUS;
	private String SYNV_STATUS;
	private String SYNF_STATUS;
	private String SYNHYBRIDS_STATUS;
	private String speciesweb_Taxcd;
	private String Status;
	private String Photo;
	private String Photographer;
	private String Thumbmaps;
	private String Accgenus;
	private String Hand;
	private String growth_habit_bck;
	private String blooming_dt_bck;
	private String origin_bck;
	private String Thumbphoto;
	private String growth_habit;
	private String blooming_dt;
	private String origin;
	private String Taxa;

	public static void main(String argv[]) throws IOException {
		Species t = new Species();
		System.out.println(t.getTaxcd());
	}
	public Species() {
		this.Taxcd = "Taxcd";
		this.Syncd = "Syncd";
		this.genus = "genus";
		this.species = "species";
		this.authority = "authority";
		this.subsp = "subsp";
		this.variety = "variety";
		this.forma = "forma";
		this.subsp_auth = "subsp_auth";
		this.var_auth = "var_auth";
		this.forma_auth = "forma_auth";
		this.sub_family = "sub_family";
		this.tribe = "tribe";
		this.common = "common";
		this.Wisc_found = "Wisc_found";
		this.ssp = "ssp";
		this.var = "var";
		this.f = "f";
		this.hybrids = "hybrids";
		this.status_code = "status_code";
		this.hide = "hide";
		this.USDA = "USDA";
		this.WETINDICAT = "WETINDICAT";
		this.FAM_NAME = "FAM_NAME";
		this.FAMILY = "FAMILY";
		this.FAMILY_COMMON = "FAMILY_COMMON";
		this.SYNWisc_found = "SYNWisc_found";
		this.SYNS_STATUS = "SYNS_STATUS";
		this.SYNV_STATUS = "SYNV_STATUS";
		this.SYNF_STATUS = "SYNF_STATUS";
		this.SYNHYBRIDS_STATUS = "SYNHYBRIDS_STATUS";
		this.speciesweb_Taxcd = "speciesweb_Taxcd";
		this.Status = "Status";
		this.Photo = "Photo";
		this.Photographer = "Photographer";
		this.Thumbmaps = "Thumbmaps";
		this.Accgenus = "Accgenus";
		this.Hand = "Hand";
		this.growth_habit_bck = "growth_habit_bck";
		this.blooming_dt_bck = "blooming_dt_bck";
		this.origin_bck = "origin_bck";
		this.Thumbphoto = "Thumbphoto";
		this.growth_habit = "growth_habit";
		this.blooming_dt = "blooming_dt";
		this.origin = "origin";
		this.Taxa = "Taxa";
	}
	public Species(String Taxcd, String Syncd, String genus, String species, String authority, String subsp, String variety, String forma, String subsp_auth, String var_auth, String forma_auth, String sub_family, String tribe, String common, String Wisc_found, String ssp, String var, String f, String hybrids, String status_code, String hide, String USDA, String WETINDICAT, String FAM_NAME, String FAMILY, String FAMILY_COMMON, String SYNWisc_found, String SYNS_STATUS, String SYNV_STATUS, String SYNF_STATUS, String SYNHYBRIDS_STATUS, String speciesweb_Taxcd, String Status, String Photo, String Photographer, String Thumbmaps, String Accgenus, String Hand, String growth_habit_bck, String blooming_dt_bck, String origin_bck, String Thumbphoto, String growth_habit, String blooming_dt, String origin, String Taxa) {
		this.Taxcd = Taxcd;
		this.Syncd = Syncd;
		this.genus = genus;
		this.species = species;
		this.authority = authority;
		this.subsp = subsp;
		this.variety = variety;
		this.forma = forma;
		this.subsp_auth = subsp_auth;
		this.var_auth = var_auth;
		this.forma_auth = forma_auth;
		this.sub_family = sub_family;
		this.tribe = tribe;
		this.common = common;
		this.Wisc_found = Wisc_found;
		this.ssp = ssp;
		this.var = var;
		this.f = f;
		this.hybrids = hybrids;
		this.status_code = status_code;
		this.hide = hide;
		this.USDA = USDA;
		this.WETINDICAT = WETINDICAT;
		this.FAM_NAME = FAM_NAME;
		this.FAMILY = FAMILY;
		this.FAMILY_COMMON = FAMILY_COMMON;
		this.SYNWisc_found = SYNWisc_found;
		this.SYNS_STATUS = SYNS_STATUS;
		this.SYNV_STATUS = SYNV_STATUS;
		this.SYNF_STATUS = SYNF_STATUS;
		this.SYNHYBRIDS_STATUS = SYNHYBRIDS_STATUS;
		this.speciesweb_Taxcd = speciesweb_Taxcd;
		this.Status = Status;
		this.Photo = Photo;
		this.Photographer = Photographer;
		this.Thumbmaps = Thumbmaps;
		this.Accgenus = Accgenus;
		this.Hand = Hand;
		this.growth_habit_bck = growth_habit_bck;
		this.blooming_dt_bck = blooming_dt_bck;
		this.origin_bck = origin_bck;
		this.Thumbphoto = Thumbphoto;
		this.growth_habit = growth_habit;
		this.blooming_dt = blooming_dt;
		this.origin = origin;
		this.Taxa = Taxa;
	}

	public Boolean isASN() {
		String ts = new String(".");
		if(Syncd.equals(ts)) {
			return true;
		}else{
			return false;
		}
	}
	//getters
	public String getTaxcd() { return Taxcd;}
	public String getSyncd() { return Syncd;}
	public String getgenus() { return genus;}
	public String getspecies() { return species;}
	public String getauthority() { return authority;}
	public String getsubsp() { return subsp;}
	public String getvariety() { return variety;}
	public String getforma() { return forma;}
	public String getsubsp_auth() { return subsp_auth;}
	public String getvar_auth() { return var_auth;}
	public String getforma_auth() { return forma_auth;}
	public String getsub_family() { return sub_family;}
	public String gettribe() { return tribe;}
	public String getcommon() { return common;}
	public String getWisc_found() { return Wisc_found;}
	public String getssp() { return ssp;}
	public String getvar() { return var;}
	public String getf() { return f;}
	public String gethybrids() { return hybrids;}
	public String getstatus_code() { return status_code;}
	public String gethide() { return hide;}
	public String getUSDA() { return USDA;}
	public String getWETINDICAT() { return WETINDICAT;}
	public String getFAM_NAME() { return FAM_NAME;}
	public String getFAMILY() { return FAMILY;}
	public String getFAMILY_COMMON() { return FAMILY_COMMON;}
	public String getSYNWisc_found() { return SYNWisc_found;}
	public String getSYNS_STATUS() { return SYNS_STATUS;}
	public String getSYNV_STATUS() { return SYNV_STATUS;}
	public String getSYNF_STATUS() { return SYNF_STATUS;}
	public String getSYNHYBRIDS_STATUS() { return SYNHYBRIDS_STATUS;}
	public String getspeciesweb_Taxcd() { return speciesweb_Taxcd;}
	public String getStatus() { return Status;}
	public String getPhoto() { return Photo;}
	public String getPhotographer() { return Photographer;}
	public String getThumbmaps() { return Thumbmaps;}
	public String getAccgenus() { return Accgenus;}
	public String getHand() { return Hand;}
	public String getgrowth_habit_bck() { return growth_habit_bck;}
	public String getblooming_dt_bck() { return blooming_dt_bck;}
	public String getorigin_bck() { return origin_bck;}
	public String getThumbphoto() { return Thumbphoto;}
	public String getgrowth_habit() { return growth_habit;}
	public String getblooming_dt() { return blooming_dt;}
	public String getorigin() { return origin;}
	public String getTaxa() { return Taxa;}

	public String[] getAll() {
		String[] specAll = new String[47];
		specAll[0] = getTaxcd();
		specAll[1] = getTaxcd();
		specAll[2] = getSyncd();
		specAll[3] = getgenus();
		specAll[4] = getspecies();
		specAll[5] = getauthority();
		specAll[6] = getsubsp();
		specAll[7] = getvariety();
		specAll[8] = getforma();
		specAll[9] = getsubsp_auth();
		specAll[10] = getvar_auth();
		specAll[11] = getforma_auth();
		specAll[12] = getsub_family();
		specAll[13] = gettribe();
		specAll[14] = getcommon();
		specAll[15] = getWisc_found();
		specAll[16] = getssp();
		specAll[17] = getvar();
		specAll[18] = getf();
		specAll[19] = gethybrids();
		specAll[20] = getstatus_code();
		specAll[21] = gethide();
		specAll[22] = getUSDA();
		specAll[23] = getWETINDICAT();
		specAll[24] = getFAM_NAME();
		specAll[25] = getFAMILY();
		specAll[26] = getFAMILY_COMMON();
		specAll[27] = getSYNWisc_found();
		specAll[28] = getSYNS_STATUS();
		specAll[29] = getSYNV_STATUS();
		specAll[30] = getSYNF_STATUS();
		specAll[31] = getSYNHYBRIDS_STATUS();
		specAll[32] = getspeciesweb_Taxcd();
		specAll[33] = getStatus();
		specAll[34] = getPhoto();
		specAll[35] = getPhotographer();
		specAll[36] = getThumbmaps();
		specAll[37] = getAccgenus();
		specAll[38] = getHand();
		specAll[39] = getgrowth_habit_bck();
		specAll[40] = getblooming_dt_bck();
		specAll[41] = getorigin_bck();
		specAll[42] = getThumbphoto();
		specAll[43] = getgrowth_habit();
		specAll[44] = getblooming_dt();
		specAll[45] = getorigin();
		specAll[46] = getTaxa();
		return specAll;
	}
		

	//setters
	void setTaxcd(String Taxcd) {this.Taxcd = Taxcd;}
	void setSyncd(String Syncd) {this.Syncd = Syncd;}
	void setgenus(String genus) {this.genus = genus;}
	void setspecies(String species) {this.species = species;}
	void setauthority(String authority) {this.authority = authority;}
	void setsubsp(String subsp) {this.subsp = subsp;}
	void setvariety(String variety) {this.variety = variety;}
	void setforma(String forma) {this.forma = forma;}
	void setsubsp_auth(String subsp_auth) {this.subsp_auth = subsp_auth;}
	void setvar_auth(String var_auth) {this.var_auth = var_auth;}
	void setforma_auth(String forma_auth) {this.forma_auth = forma_auth;}
	void setsub_family(String sub_family) {this.sub_family = sub_family;}
	void settribe(String tribe) {this.tribe = tribe;}
	void setcommon(String common) {this.common = common;}
	void setWisc_found(String Wisc_found) {this.Wisc_found = Wisc_found;}
	void setssp(String ssp) {this.ssp = ssp;}
	void setvar(String var) {this.var = var;}
	void setf(String f) {this.f = f;}
	void sethybrids(String hybrids) {this.hybrids = hybrids;}
	void setstatus_code(String status_code) {this.status_code = status_code;}
	void sethide(String hide) {this.hide = hide;}
	void setUSDA(String USDA) {this.USDA = USDA;}
	void setWETINDICAT(String WETINDICAT) {this.WETINDICAT = WETINDICAT;}
	void setFAM_NAME(String FAM_NAME) {this.FAM_NAME = FAM_NAME;}
	void setFAMILY(String FAMILY) {this.FAMILY = FAMILY;}
	void setFAMILY_COMMON(String FAMILY_COMMON) {this.FAMILY_COMMON = FAMILY_COMMON;}
	void setSYNWisc_found(String SYNWisc_found) {this.SYNWisc_found = SYNWisc_found;}
	void setSYNS_STATUS(String SYNS_STATUS) {this.SYNS_STATUS = SYNS_STATUS;}
	void setSYNV_STATUS(String SYNV_STATUS) {this.SYNV_STATUS = SYNV_STATUS;}
	void setSYNF_STATUS(String SYNF_STATUS) {this.SYNF_STATUS = SYNF_STATUS;}
	void setSYNHYBRIDS_STATUS(String SYNHYBRIDS_STATUS) {this.SYNHYBRIDS_STATUS = SYNHYBRIDS_STATUS;}
	void setspeciesweb_Taxcd(String speciesweb_Taxcd) {this.speciesweb_Taxcd = speciesweb_Taxcd;}
	void setStatus(String Status) {this.Status = Status;}
	void setPhoto(String Photo) {this.Photo = Photo;}
	void setPhotographer(String Photographer) {this.Photographer = Photographer;}
	void setThumbmaps(String Thumbmaps) {this.Thumbmaps = Thumbmaps;}
	void setAccgenus(String Accgenus) {this.Accgenus = Accgenus;}
	void setHand(String Hand) {this.Hand = Hand;}
	void setgrowth_habit_bck(String growth_habit_bck) {this.growth_habit_bck = growth_habit_bck;}
	void setblooming_dt_bck(String blooming_dt_bck) {this.blooming_dt_bck = blooming_dt_bck;}
	void setorigin_bck(String origin_bck) {this.origin_bck = origin_bck;}
	void setThumbphoto(String Thumbphoto) {this.Thumbphoto = Thumbphoto;}
	void setgrowth_habit(String growth_habit) {this.growth_habit = growth_habit;}
	void setblooming_dt(String blooming_dt) {this.blooming_dt = blooming_dt;}
	void setorigin(String origin) {this.origin = origin;}
	void setTaxa(String Taxa) {this.Taxa = Taxa;}

}




