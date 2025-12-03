package com.demo.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Cart {
	@Id
	private int cid;
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Items>items;
	public Cart() {
		super();
	}
	public Cart(int cid, List<Items> items) {
		super();
		this.cid = cid;
		this.items = items;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Cart [cid=" + cid + ", items=" + items + "]";
	}
	
	
	
}
