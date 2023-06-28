package com.demo.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="product120")
public class Product {
	@Id
	private int pid;
	private float price;
	@Embedded
	Ware_house loc;
	public Product() {
		super();
	}
	public Product(int pid, float price, Ware_house loc) {
		super();
		this.pid = pid;
		this.price = price;
		this.loc = loc;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Ware_house getLoc() {
		return loc;
	}
	public void setLoc(Ware_house loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", price=" + price + ", loc=" + loc + "]";
	}
	
}
