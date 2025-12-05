package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="nonperishable")
public class NonPerishable extends Product{
	private int guarantee;

	public NonPerishable() {
		super();
	}

	public NonPerishable(int pid, String pname, int qty, double price, LocalDate mfgdate,int guarantee) {
		super(pid, pname, qty, price, mfgdate);
		this.guarantee=guarantee;
	}

	public int getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(int guarantee) {
		this.guarantee = guarantee;
	}

	@Override
	public String toString() {
		return super.toString()+"NonPerishable [guarantee=" + guarantee + "]";
	}

}
