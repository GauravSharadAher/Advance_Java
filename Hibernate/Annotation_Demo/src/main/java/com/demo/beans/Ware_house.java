package com.demo.beans;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class Ware_house {
	private int wid;
	private String city;
	private String addrs;
	public Ware_house() {
		super();
	}
	public Ware_house(int wid, String city, String addrs) {
		super();
		this.wid = wid;
		this.city = city;
		this.addrs = addrs;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	@Override
	public String toString() {
		return "Ware_house [wid=" + wid + ", city=" + city + ", addrs=" + addrs + "]";
	}
	
}
