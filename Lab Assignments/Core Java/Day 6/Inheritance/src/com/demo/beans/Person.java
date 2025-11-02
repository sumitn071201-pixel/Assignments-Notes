package com.demo.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	static int scount,vcount,ccount,cucount;
	static {
		scount = 0;
		vcount = 0;
		ccount = 0;
		cucount=0;
	}
	private String pid;
	private String pname;
	private Date bdate;
	
	public Person() {
		System.out.println("in person default constructor!");
		 pid=generatedId("s");
		 pname =null;
		 bdate=null;
	}
	public Person(String emptype,String pname,Date bdate) {
		System.out.println("in person parameterized constructor");
		pid=generatedId(emptype);
		this.pname=pname;
		this.bdate=bdate;
	}
	private String generatedId(String emptype) {
		if(emptype.equals("s")) {
			scount++;
		}
		else if(emptype.equals("c")){
			ccount++;
		}
		else if(emptype.equals("v")) {
			vcount++;
		}
		else {
			return "cu"+cucount;
		}
		return emptype;
	}
	public String getPid() {
		return pid;
	}
	public static int getScount() {
		return scount;
	}
	public static int getVcount() {
		return vcount;
	}
	public static int getCcount() {
		return ccount;
	}
	public static int getCucount() {
		return cucount;
	}
	public String getPname() {
		return pname;
	}
	public Date getBdate() {
		return bdate;
	}
	public static void setScount(int scount) {
		Person.scount = scount;
	}
	public static void setVcount(int vcount) {
		Person.vcount = vcount;
	}
	public static void setCcount(int ccount) {
		Person.ccount = ccount;
	}
	public static void setCucount(int cucount) {
		Person.cucount = cucount;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

public String toString() {
	SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	String str=sdf.format(bdate);
	return "Person[pid "+ pid +",pname="+ pname +",bdate"+str+"]";
}
}