package com.demo.beans;

public class Customer {
	private int cid;
	private String cname;
	private String mob;
	public Customer() {
		super();
	}
	public Customer(int cid, String cname, String mob) {
		this.cid = cid;
		this.cname = cname;
		this.mob = mob;
	}
	
	public Customer(int cid) {
		this.cid = cid;
	}
	public int getCid() {
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public String getMob() {
		return mob;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", mob=" + mob + "]";
	}
	@Override
	public int hashCode() {
		return cid;
	}
	@Override
	public boolean equals(Object obj) {
		return this.cid==((Customer)obj).cid;
	}
	
	
	
}
