package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="address123")
public class Address {
	@Id
	private int addrid;
	private String city,street;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="uid")
	private Myuser u1;
	public Address() {
		super();
	}
	public Address(int addrid, String city, String street, Myuser u1) {
		super();
		this.addrid = addrid;
		this.city = city;
		this.street = street;
		this.u1 = u1;
	}
	public int getAddrid() {
		return addrid;
	}
	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Myuser getU1() {
		return u1;
	}
	public void setU1(Myuser u1) {
		this.u1 = u1;
	}
	@Override
	public String toString() {
		return "Address [addrid=" + addrid + ", city=" + city + ", street=" + street +  "]";
	}
	
	
}
