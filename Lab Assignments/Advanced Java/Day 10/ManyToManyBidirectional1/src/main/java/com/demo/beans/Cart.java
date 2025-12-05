package com.demo.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="MyCart")
public class Cart {
	@Id
	private int cid;
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Item>item;
	public Cart() {
		super();
	}
	public Cart(int cid, List<Item> item) {
		super();
		this.cid = cid;
		this.item = item;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public List<Item> getItems() {
		return item;
	}
	public void setItems(List<Item> item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Cart [cid=" + cid + ", item=" + item+ "]";
	}
	
	
	
}
