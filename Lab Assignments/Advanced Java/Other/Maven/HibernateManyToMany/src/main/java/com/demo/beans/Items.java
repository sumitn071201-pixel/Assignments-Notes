package com.demo.beans;

import java.util.List;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Items {
	@Id
	private int itemId;
	private String name;
	private double price;
	private int qty;
	@ManyToMany(mappedBy = "items")
	private List<Cart>cart;
	public Items() {
		super();
	}
	public Items(String name, double price, int qty, List<Cart> cart) {
		super();
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.cart = cart;
	}
	
	public Items(int itemId, String name, double price, int qty) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public List<Cart> getCart() {
		return cart;
	}
	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", name=" + name + ", price=" + price + ", qty=" + qty 
				+ "]";
	}
	
	
}
